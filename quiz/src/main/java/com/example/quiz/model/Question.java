package com.example.quiz.model;



import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Question {
	
	
	private Long id;
	
	private String question;
	
	private Long quizId;

	public Question() {
		
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

