package kielce.tu.weaii.telelearn.controllers;

import kielce.tu.weaii.telelearn.requests.courses.PostCommentRequest;
import kielce.tu.weaii.telelearn.requests.courses.PostRequest;
import kielce.tu.weaii.telelearn.services.ports.PostService;
import kielce.tu.weaii.telelearn.views.courses.CommentView;
import kielce.tu.weaii.telelearn.views.courses.PostView;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("{id}")
    public ResponseEntity<PostView> getPost(@PathVariable Long id) {
        return new ResponseEntity<>(PostView.from(postService.getById(id)), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Object> addPost(@Valid @ModelAttribute PostRequest request,
                                          @RequestParam(required = false) List<MultipartFile> files) {
        try {
            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(postService.addPost(request, files).getId()).toUri();
            return ResponseEntity.created(location).build();
        } catch (IOException e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(path = {"{id}"})
    public ResponseEntity<Object> editPost(@PathVariable Long id,
                                           @Valid @ModelAttribute PostRequest request,
                                           @RequestParam(required = false) List<MultipartFile> files) {
        try {
            postService.updatePost(id, request, files);
        } catch (IOException e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<Object> deletePost(@PathVariable Long id) {
        postService.removePost(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(path = "/{id}/comment")
    public ResponseEntity<List<CommentView>> getPostComments(@PathVariable Long id) {
        return new ResponseEntity<>(postService.getComments(id).stream()
                .map(CommentView::from)
                .collect(Collectors.toList()),
                HttpStatus.OK);
    }

    @PostMapping(path = "/{id}/comment")
    public ResponseEntity<Object> addComment(@PathVariable Long id, @Valid @RequestBody PostCommentRequest request) {
        postService.addComment(id, request);
        return ResponseEntity.noContent().build();
    }

}
