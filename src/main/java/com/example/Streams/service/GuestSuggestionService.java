package com.example.Streams.service;

import com.example.Streams.Enum.SuggestionStatus;
import com.example.Streams.entity.GuestSuggestionEntity;
import com.example.Streams.repository.GuestSuggestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class GuestSuggestionService {

    private GuestSuggestionRepository guestSuggestionRepository;

    public GuestSuggestionService(GuestSuggestionRepository guestSuggestionRepository) {
        this.guestSuggestionRepository = guestSuggestionRepository;
    }

    SuggestionProcessor processSuggestion = (suggestionText, rate, status) -> {
        GuestSuggestionEntity suggestionEntity = new GuestSuggestionEntity();
        suggestionEntity.setRate(rate);
        suggestionEntity.setSuggestionText(suggestionText);
        suggestionEntity.setSuggestionType(status);
        guestSuggestionRepository.save(suggestionEntity);
    };

    public String printAndProcessSuggestion(String text, int rate, SuggestionStatus status) {
        processSuggestion.process(text, rate, status);
        return "Successful";
    }

    public Stream<GuestSuggestionEntity> findAllCreatedSuggestions() {
        return guestSuggestionRepository.findAll().stream().filter(guest -> guest.getSuggestionType().equals(SuggestionStatus.CREATE));
    }

    public Stream<GuestSuggestionEntity> findAllRemovedSuggestions() {
        return guestSuggestionRepository.findAll().stream().filter(guest -> guest.getSuggestionType().equals(SuggestionStatus.REMOVE));
    }



}
