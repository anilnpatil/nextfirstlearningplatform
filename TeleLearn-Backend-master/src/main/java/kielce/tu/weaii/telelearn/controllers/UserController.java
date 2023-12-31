package kielce.tu.weaii.telelearn.controllers;

import kielce.tu.weaii.telelearn.requests.LoginRequest;
import kielce.tu.weaii.telelearn.requests.UserPasswordPatchRequest;
import kielce.tu.weaii.telelearn.services.ports.UserService;
import kielce.tu.weaii.telelearn.views.UserLoginResponse;
import kielce.tu.weaii.telelearn.views.UserView;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

import static kielce.tu.weaii.telelearn.security.Constants.AUTH_COOKIE;
import static org.springframework.http.HttpStatus.OK;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @PostMapping(path = "/login")
    public ResponseEntity<Object> login(@RequestBody @Valid LoginRequest loginRequest,
                                        HttpServletResponse response) {
        Cookie cookie = new Cookie(AUTH_COOKIE, userService.getJwt(loginRequest).getAccessToken());
        cookie.setHttpOnly(true);
        cookie.setPath("/api");
        cookie.setMaxAge(-1);
        response.addCookie(cookie);
        return new ResponseEntity<>(UserLoginResponse.of(userService.getUserByLoginOrEmail(loginRequest.getUserName())), OK);
    }

    @DeleteMapping(path = "logout")
    public ResponseEntity<Object> logout(HttpServletResponse response) {
        Cookie cookie = new Cookie(AUTH_COOKIE, null);
        cookie.setHttpOnly(true);
        cookie.setPath("/api");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<UserView>> getList() {
        return new ResponseEntity<>(
                userService.getList()
                        .stream()
                        .map(model -> UserView.from(model, true))
                        .collect(Collectors.toList()),
                OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<UserView> getById(@PathVariable Long id) {
        return new ResponseEntity<>(UserView.from(userService.getById(id), userService.isCurrentUserOrAdmin(id)), OK);
    }

    @PatchMapping(path = {"/{id}"})
    public ResponseEntity<Object> changePassword(@PathVariable Long id, @RequestBody @Valid UserPasswordPatchRequest request) {
        userService.updatePassword(id, request);
        return ResponseEntity.noContent().build();
    }

}
