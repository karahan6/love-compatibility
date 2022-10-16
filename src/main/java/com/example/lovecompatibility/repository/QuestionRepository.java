package com.example.lovecompatibility.repository;

import com.example.lovecompatibility.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long>
{
}

