package com.example.lovecompatibility.controller;

import com.example.lovecompatibility.domain.Question;
import com.example.lovecompatibility.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/question")
public class QuestionController
{
    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/listAll")
    public List<Question> listAll() {
        List<Question> questions = questionRepository.findAll();

        return questions;
    }
}
