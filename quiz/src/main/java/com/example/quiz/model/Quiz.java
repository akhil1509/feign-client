package com.example.quiz.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table
public class Quiz {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	transient private List<Question> question;

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Quiz(Long id, String title, List<Question> question) {
		super();
		this.id = id;
		this.title = title;
		this.question = question;
	}




	@Override
	public String toString() {
		return "Quiz [id=" + id + ", title=" + title + ", question=" + question + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public List<Question> getQuestion() {
		return question;
	}




	public void setQuestion(List<Question> question) {
		this.question = question;
	}
	
	
	
	
	
}
