package org.coteis.controller.category;

import lombok.RequiredArgsConstructor;
import org.coteis.dto.category.DifficultyResponse;
import org.coteis.service.category.DifficultyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class DifficultyController {
    private final DifficultyService difficultyService;

    @GetMapping("/api/difficulties")
    public ResponseEntity<List<DifficultyResponse>> findAllDifficulties(){
        List<DifficultyResponse> difficulties = difficultyService.findAll()
                .stream()
                .map(DifficultyResponse::new)
                .toList();

        return ResponseEntity.ok().body(difficulties);
    }
}
