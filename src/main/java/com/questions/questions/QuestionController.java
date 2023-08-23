package com.questions.questions;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("questions")
public class QuestionController {
	@GetMapping("allQuestions")
	public String getAllQuestions()
	{
		return "Hi i got questions";
	}
	
	Random r = new Random();

}
