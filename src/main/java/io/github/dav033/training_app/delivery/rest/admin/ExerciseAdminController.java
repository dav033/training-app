package io.github.dav033.training_app.delivery.rest.admin;

import io.github.dav033.training_app.application.ports.input.CreateExerciseUseCase;
import io.github.dav033.training_app.application.ports.input.ListExercisesUseCase;
import io.github.dav033.training_app.delivery.dto.CreateExerciseRequest;
import io.github.dav033.training_app.domain.models.Exercise;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/exercises")
public class ExerciseAdminController {

    private final CreateExerciseUseCase createExerciseUseCase;
    private final ListExercisesUseCase listExercisesUseCase;

    public ExerciseAdminController(CreateExerciseUseCase createExerciseUseCase, ListExercisesUseCase listExercisesUseCase) {
        this.createExerciseUseCase = createExerciseUseCase;
        this.listExercisesUseCase = listExercisesUseCase;
    }

    @PostMapping
    public ResponseEntity<String> createExercise(@RequestBody CreateExerciseRequest exerciseRequest) {

        System.out.println("ExerciseAdminController.createExercise" + exerciseRequest);

        Exercise exercise = new Exercise(exerciseRequest.name(), exerciseRequest.description());
        Exercise createdExercise = createExerciseUseCase.execute(exercise);

        return ResponseEntity.ok("Exercise created with id: " + createdExercise.getId());
    }

    @GetMapping
    public ResponseEntity<List<Exercise>> listExercises() {
        return ResponseEntity.ok(listExercisesUseCase.execute());
    }


}
