package com.example.gewerbeanmeldung.Question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/frage")
public class QuestionController {

	
	@Autowired
	QuestionService questionService;
	//Lists all Questions 
		@RequestMapping(path = "")
		public List<Question> getAllQuestions() {	
			return questionService.getAllQuestions();
		}
		
	//Add a new Question
	@RequestMapping(
	 method = RequestMethod.POST,value = "")
	 public Question saveQuestion(@RequestBody Question question) {
	     return questionService.saveQuestion(question);
	}	
}
