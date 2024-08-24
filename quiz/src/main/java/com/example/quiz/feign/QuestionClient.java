package com.example.quiz.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.quiz.model.Question;

@FeignClient(url = "http://localhost:8082", value = "Question-client")
public interface QuestionClient {
	
	   @GetMapping("Question/quiz/{quizId}")
	   public List<Question> getAllQuiz(@PathVariable long quizId);

}
