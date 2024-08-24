package com.example.quiz.service;

import java.util.List;

import com.example.quiz.model.Question;
import com.example.quiz.model.Quiz;

public interface QuizService {
	
	public Quiz addQuiz(Quiz quiz);
	
	public Quiz getQuizById(Long id);
	
	public List<Quiz> getAllQuiz();
	
	

}
