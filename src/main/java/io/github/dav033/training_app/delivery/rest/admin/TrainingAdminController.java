package io.github.dav033.training_app.delivery.rest.admin;


import io.github.dav033.training_app.application.ports.input.CreateRoutineUseCase;
import io.github.dav033.training_app.delivery.dto.CreateRoutineRequest;
import io.github.dav033.training_app.domain.models.Exercise;
import io.github.dav033.training_app.domain.models.Routine;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/trainings")
public class TrainingAdminController {

    private final CreateRoutineUseCase createRoutineUseCase;

    public TrainingAdminController(CreateRoutineUseCase createRoutineUseCase) {
        this.createRoutineUseCase = createRoutineUseCase;
    }

    @PostMapping
    public ResponseEntity<String> createRoutine(@RequestBody CreateRoutineRequest request) {
        Routine routine = Routine.builder()
                .name(request.name())
                .description(request.description())
                .build();
        Routine createdRoutine = createRoutineUseCase.execute(routine);
        return ResponseEntity.ok("Routine created with id: " + createdRoutine.getId());
    }

}
