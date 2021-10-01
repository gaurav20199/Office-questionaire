package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.*;
import com.example.demo.dao.QuestionRepository;
import com.example.demo.entity.Question;


@Service
public class QuestionService {
	
	@Autowired
	QuestionRepository repository;

	
	
	public List<Question> getAllQuestions(){
		//return repository.findAll();
		
		return repository.findRandomQuestions();
	}
	
	public Question insertQuestion(Question ques) {
		repository.save(ques);
		return ques;
	}
	
	

}
