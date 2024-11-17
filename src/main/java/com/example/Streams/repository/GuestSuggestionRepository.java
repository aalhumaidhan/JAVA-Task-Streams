package com.example.Streams.repository;

import com.example.Streams.entity.GuestSuggestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestSuggestionRepository extends JpaRepository<GuestSuggestionEntity, Long> {
}
