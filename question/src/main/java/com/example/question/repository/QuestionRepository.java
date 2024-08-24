package com.example.question.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.question.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	
	List<Question> findByQuizId(Long quizId);
	

}
