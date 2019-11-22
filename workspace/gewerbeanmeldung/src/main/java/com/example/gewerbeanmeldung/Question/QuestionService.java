package com.example.gewerbeanmeldung.Question;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepo;
	
	//Lists all questions
		public List<Question> getAllQuestions() {
			List<Question>frageList = new ArrayList<>();
			questionRepo.findAll().forEach(frageList::add);
			return frageList;
		}

		public Question saveQuestion(Question question) {
			questionRepo.save(question);
			return question;
		}

}
