package com.example.Streams.service;

import com.example.Streams.Enum.SuggestionStatus;

@FunctionalInterface
public interface SuggestionProcessor {
    void process(String suggestionText, int rate, SuggestionStatus status);
}
