package com.example.quiz.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz.feign.QuestionClient;
import com.example.quiz.model.Quiz;
import com.example.quiz.repository.QuizRepository;

@Service
public class QuizServiceimpl implements QuizService{
	@Autowired
	private QuizRepository quizRepository;
	
	@Autowired
	private QuestionClient quizClient;

	@Override
	public Quiz addQuiz(Quiz quiz) {
		
		return quizRepository.save(quiz);
	}

	@Override
	public Quiz getQuizById(Long id) {
		 Quiz the = quizRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
		 the.setQuestion(quizClient.getAllQuiz(the.getId()));
		return the;
	}

	@Override
	public List<Quiz> getAllQuiz() {
		List<Quiz> All = quizRepository.findAll();
		List<Quiz> collect = All.stream().map(e->{
			e.setQuestion(quizClient.getAllQuiz(e.getId()));
			return e;
		}).collect(Collectors.toList());
		return collect;
	}
	
	

	

}
