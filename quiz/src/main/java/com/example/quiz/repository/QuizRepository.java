package com.example.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.quiz.model.Question;
import com.example.quiz.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
	
	

}
