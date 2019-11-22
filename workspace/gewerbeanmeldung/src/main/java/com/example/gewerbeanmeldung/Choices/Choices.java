package com.example.gewerbeanmeldung.Choices;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.example.gewerbeanmeldung.QuestionType.QuestionType;
import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class Choices {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	private String choice;
	
	@ManyToOne
	@JoinColumn(name="question_id", nullable=false)
	@JsonIgnore
	private QuestionType questionType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public QuestionType getQuestionType() {
		return questionType;
	}

	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}

	
}
