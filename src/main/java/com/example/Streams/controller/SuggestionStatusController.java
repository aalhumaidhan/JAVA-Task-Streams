package com.example.Streams.controller;

import com.example.Streams.bo.CreateSuggestionRequest;
import com.example.Streams.entity.GuestSuggestionEntity;
import com.example.Streams.service.GuestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/suggestions")
public class SuggestionStatusController {

    private final GuestSuggestionService guestSuggestionService;

    public SuggestionStatusController(GuestSuggestionService guestSuggestionService) {
        this.guestSuggestionService = guestSuggestionService;
    }

    @GetMapping("/created")
    public Stream<GuestSuggestionEntity> getCreatedUsers() {
        return guestSuggestionService.findAllCreatedSuggestions();
    }

    @GetMapping("/removed")
    public Stream<GuestSuggestionEntity> getRemovedUsers() {
        return guestSuggestionService.findAllRemovedSuggestions();
    }
}
