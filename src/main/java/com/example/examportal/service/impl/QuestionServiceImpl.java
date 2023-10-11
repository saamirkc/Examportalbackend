package com.example.examportal.service.impl;

import com.example.examportal.model.exam.Question;
import com.example.examportal.model.exam.Quiz;
import com.example.examportal.repo.QuestionRepository;
import com.example.examportal.repo.QuizRepository;
import com.example.examportal.service.QuestionService;
import com.example.examportal.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class QuestionServiceImpl implements QuestionService {
@Autowired
    private QuestionRepository questionRepository;
    @Override
    public Question addQuestion(Question question) {
        return this.questionRepository.save(question);
    }

    @Override
    public Question updateQuestion(Question question) {
        return this.questionRepository.save(question);
    }

    @Override
    public Set<Question> getQuestion() {
        return new HashSet<>(this.questionRepository.findAll());
    }

    @Override
    public Question getQuestion(Long questionId) {
        return this.questionRepository.findById(questionId).get();
    }
    @Override
    public Set<Question> getQuestionsOfQuiz(Quiz quiz) {
        return this.questionRepository.findByQuiz(quiz);
    }
    @Override
    public void deleteQuestion(Long questionId){
      this.questionRepository.deleteById(questionId);
    }
}
