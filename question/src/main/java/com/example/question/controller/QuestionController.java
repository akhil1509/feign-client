package com.example.question.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.question.model.Question;
import com.example.question.service.QuestionServiceImpl;

@RestController
@RequestMapping("/Question")
public class QuestionController {
	public QuestionServiceImpl questionServiceImpl;

	public QuestionController(QuestionServiceImpl questionServiceImpl) {

		this.questionServiceImpl = questionServiceImpl;
	}
    @PostMapping("/addQues")
	public Question addQues(@RequestBody Question question) {
		return questionServiceImpl.addQuestion(question);
	}
    @GetMapping("/getQuesById/{id}")
	public Question getQuesById(@PathVariable long id) {
		return questionServiceImpl.getQuestionById(id);
	}
   @GetMapping("/getAllQues")
	public List<Question> getAllQues() {
		return questionServiceImpl.getAllQuestion();
	}
   
   @GetMapping("/quiz/{quizId}")
   public List<Question> getAllQuiz(@PathVariable long quizId){
	   return questionServiceImpl.getAllQuizById(quizId);
   }

}
