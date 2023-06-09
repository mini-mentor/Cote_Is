package org.coteis.controller.category;

import lombok.RequiredArgsConstructor;
import org.coteis.dto.category.PrevioustestResponse;
import org.coteis.service.category.PrevioustestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PreviousetestApiController {

    private final PrevioustestService previoustestService;

    @GetMapping("/api/previoustests")
    public ResponseEntity<List<PrevioustestResponse>> findAllPrevious(){
        List<PrevioustestResponse> previoustests = previoustestService.findAll()
                .stream()
                .map(PrevioustestResponse::new)
                .toList();
        return ResponseEntity.ok().body(previoustests);
    }
}
