package com.example.lovecompatibility.service;

import com.example.lovecompatibility.domain.Question;
import com.example.lovecompatibility.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService
{
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> findAll()
    {
        return questionRepository.findAll();
    }
}
