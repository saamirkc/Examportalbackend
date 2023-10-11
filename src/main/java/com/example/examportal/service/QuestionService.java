package com.example.examportal.service;

import com.example.examportal.model.exam.Question;
import com.example.examportal.model.exam.Quiz;

import java.util.Set;

public interface QuestionService {
    public Question addQuestion(Question question);
    public Question updateQuestion(Question question);
    public Set<Question> getQuestion();
    public Question getQuestion(Long questionId);
    public Set<Question>getQuestionsOfQuiz(Quiz quiz);
    public void deleteQuestion(Long questionId);
}
