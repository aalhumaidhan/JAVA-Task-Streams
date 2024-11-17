package com.example.Streams.controller;

import com.example.Streams.bo.CreateSuggestionRequest;
import com.example.Streams.service.GuestSuggestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SuggestionController {

    private final GuestSuggestionService suggestionService;

    public SuggestionController(GuestSuggestionService suggestionService) {
        this.suggestionService = suggestionService;
    }

    @PostMapping("/suggestions")
    public ResponseEntity<String> processSuggestion(@RequestBody CreateSuggestionRequest request) {
        String response = suggestionService.printAndProcessSuggestion(request.getSuggestionText(), request.getRate(), request.getStatus());
        if (response != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

}
