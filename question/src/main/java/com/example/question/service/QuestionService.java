package com.example.question.service;

import java.util.List;

import com.example.question.model.Question;

public interface QuestionService {
	public Question addQuestion(Question question);
	
	public Question getQuestionById(Long id);
	
	public List<Question> getAllQuestion();
	
	public List<Question> getAllQuizById(Long quizid);

}
