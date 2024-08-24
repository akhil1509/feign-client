package com.example.quiz.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz.model.Quiz;
import com.example.quiz.service.QuizServiceimpl;

@RestController
@RequestMapping("/Quiz")
public class QuizController {

	
	public QuizServiceimpl quizServiceimpl;

	public QuizController(QuizServiceimpl quizServiceimpl) {
		
		this.quizServiceimpl = quizServiceimpl;
	}
	@PostMapping("/addingQuiz")
	public ResponseEntity<Quiz> addingQuiz(@RequestBody Quiz quiz){
		Quiz add = quizServiceimpl.addQuiz(quiz);
		return new ResponseEntity<>(add, HttpStatus.OK);
	}
	@GetMapping("/getingQuiz/{id}")
	public ResponseEntity<Quiz> getingQuiz(@PathVariable Long id){
		Quiz get = quizServiceimpl.getQuizById(id);
		return new ResponseEntity<>(get, HttpStatus.FOUND);
	}
	@GetMapping("/getingAllQuiz")
	public ResponseEntity<List<Quiz>> getingAllQuiz(){
		 List<Quiz> all = quizServiceimpl.getAllQuiz();
		return new ResponseEntity<>(all, HttpStatus.ACCEPTED);
    }
}
