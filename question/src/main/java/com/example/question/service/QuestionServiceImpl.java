package com.example.question.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.question.model.Question;
import com.example.question.repository.QuestionRepository;
@Service
public class QuestionServiceImpl implements QuestionService {
	
	public QuestionRepository questionRepository;
	

	public QuestionServiceImpl(QuestionRepository questionRepository) {
		
		this.questionRepository = questionRepository;
	}

	@Override
	public Question addQuestion(Question question) {
		
		return questionRepository.save(question);
	}

	@Override
	public Question getQuestionById(Long id) {
		
		return questionRepository.findById(id).orElseThrow();
	}

	@Override
	public List<Question> getAllQuestion() {
		
		return questionRepository.findAll();
	}

	@Override
	public List<Question> getAllQuizById(Long quizId) {
		
		return questionRepository.findByQuizId(quizId);
	}

	

}
