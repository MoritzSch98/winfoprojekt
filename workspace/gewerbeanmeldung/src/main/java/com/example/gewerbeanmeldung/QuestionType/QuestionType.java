package com.example.gewerbeanmeldung.QuestionType;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.example.gewerbeanmeldung.Choices.Choices;


@Entity
public class QuestionType{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@NotNull
	private String type;
	
	@OneToMany(mappedBy="questionType")
	private List<Choices> choices;

	public QuestionType() {
		
	}
	
	public QuestionType(String type){
		this.type =type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Choices> getChoices() {
		return choices;
	}

	public void setChoices(List<Choices> choices) {
		this.choices = choices;
	}

}
