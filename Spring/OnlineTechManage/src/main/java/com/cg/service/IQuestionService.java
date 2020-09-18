package com.cg.service;



import java.util.List;



import com.cg.dto.QuestionDto;

import com.cg.entity.Questions;

import com.cg.exceptions.QuestionAddException;



public interface IQuestionService {
 public String addQuestion1(Questions questiondto) throws QuestionAddException;
 public List<Questions> getAllQuestion();



}

