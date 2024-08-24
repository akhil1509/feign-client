package com.example.question.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String question;
	
	private Long quizId;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(Long id, String question, Long quizId) {
		super();
		this.id = id;
		this.question = question;
		this.quizId = quizId;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", quizId=" + quizId + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Long getquizId() {
		return quizId;
	}

	public void setquizId(Long quizId) {
		this.quizId = quizId;
	}

	
	

}
