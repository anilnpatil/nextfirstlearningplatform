package kielce.tu.weaii.telelearn.controllers;

import kielce.tu.weaii.telelearn.requests.courses.RecordLearningRequest;
import kielce.tu.weaii.telelearn.requests.courses.ScheduleTaskRequest;
import kielce.tu.weaii.telelearn.requests.courses.ScheduleUpdateRequest;
import kielce.tu.weaii.telelearn.services.ports.TaskScheduleService;
import kielce.tu.weaii.telelearn.views.courses.TaskScheduleView;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.time.LocalDate;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/schedule")
public class TaskScheduleController {
    private final TaskScheduleService taskScheduleService;

    @GetMapping(path = "/{id}")
    @PreAuthorize("hasRole('STUDENT')")
    public ResponseEntity<TaskScheduleView> getById(@PathVariable Long id) {
        return new ResponseEntity<>(TaskScheduleView.form(taskScheduleService.getById(id)), HttpStatus.OK);
    }

    @PostMapping
    @PreAuthorize("hasRole('STUDENT')")
    public ResponseEntity<Object> schedule(@RequestBody @Valid ScheduleTaskRequest request) {
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(taskScheduleService.schedule(request, LocalDate.now()).getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping(path = "/{id}/planned-time")
    @PreAuthorize("hasRole('STUDENT')")
    public ResponseEntity<Object> updateSchedule(@PathVariable Long id, @RequestBody @Valid ScheduleUpdateRequest request) {
        taskScheduleService.updateSchedule(id, request, LocalDate.now());
        return ResponseEntity.noContent().build();
    }

    @PatchMapping(path = "/{id}/learning-time")
    @PreAuthorize("hasRole('STUDENT')")
    public ResponseEntity<Object> patchLearningTime(@PathVariable Long id, @RequestBody @Valid RecordLearningRequest request) {
        taskScheduleService.updateLearningTime(id, request, LocalDate.now());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(path = "/{id}")
    @PreAuthorize("hasRole('STUDENT')")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        taskScheduleService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
