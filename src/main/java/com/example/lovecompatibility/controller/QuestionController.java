package com.example.lovecompatibility.controller;

import com.example.lovecompatibility.domain.Question;
import com.example.lovecompatibility.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/questions")
public class QuestionController
{
    @Autowired
    private QuestionService questionService;

    @GetMapping("")
    public List<Question> listAll() {
        return questionService.findAll();
    }


    @GetMapping("test")
    public String test() {
        return "questionService.findAll()";
    }
}
