package com.cg.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.util.QuestionConstants;
import com.cg.dto.AddQuestionSuccessMessage;

import com.cg.entity.Questions;
import com.cg.exceptions.QuestionAddException;
import com.cg.service.QuestionService;

@RestController

@CrossOrigin(value="http://localhost:4200")

public class AddQuestionMicroservice {

 @Autowired

 private QuestionService questionService;



 @PostMapping(QuestionConstants.ADD_QUESTION_URL)

  public AddQuestionSuccessMessage AddQuestion(@RequestBody Questions questiondto) throws QuestionAddException{

 String msg= questionService.addQuestion1(questiondto);

 return new AddQuestionSuccessMessage(msg);

 }



 @GetMapping("/getAllQuestion")

 public List<Questions> getMyAllQuestion(){

 return questionService.getAllQuestion();

 }
 }









