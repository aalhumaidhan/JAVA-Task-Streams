package com.example.Streams.entity;

import com.example.Streams.Enum.SuggestionStatus;
import jakarta.persistence.*;

@Entity
public class GuestSuggestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rate;
    private String suggestionText;
    @Enumerated(EnumType.STRING)
    private SuggestionStatus suggestionType;

    public GuestSuggestionEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getSuggestionText() {
        return suggestionText;
    }

    public void setSuggestionText(String suggestionText) {
        this.suggestionText = suggestionText;
    }

    public SuggestionStatus getSuggestionType() {
        return suggestionType;
    }

    public void setSuggestionType(SuggestionStatus suggestionType) {
        this.suggestionType = suggestionType;
    }
}
