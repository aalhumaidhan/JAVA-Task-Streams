package com.example.Streams.bo;

import com.example.Streams.Enum.SuggestionStatus;

public class CreateSuggestionRequest {
    private int rate;
    private String suggestionText;
    private SuggestionStatus status;

    public CreateSuggestionRequest(int rate, String suggestionText, SuggestionStatus status) {
        this.rate = rate;
        this.suggestionText = suggestionText;
        this.status = status;
    }

    public int getRate() {
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

    public SuggestionStatus getStatus() {
        return status;
    }

    public void setStatus(SuggestionStatus status) {
        this.status = status;
    }
}
