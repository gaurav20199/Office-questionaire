package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Question;
import com.example.demo.service.QuestionService;



@Controller
public class QuestionController {
	@Autowired
	QuestionService service;
	
	//Priyanshu Code start
	@RequestMapping("/fetchallQuestions")
	@ResponseBody
	public List<Question> fetchAllQuestions() {
		System.out.println(service.getAllQuestions());
		return service.getAllQuestions();
	}
	
	@PostMapping(path="/insertQuestion",consumes= {"application/json"})  // We can use consume to only accept JSON
	@ResponseBody
	public Question insertQuestion(@RequestBody Question ques) {
		
		service.insertQuestion(ques);
		return ques;
	}
}
