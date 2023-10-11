package com.example.examportal.contoller;

import com.example.examportal.model.exam.Category;
import com.example.examportal.model.exam.Quiz;
import com.example.examportal.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
@CrossOrigin("*")
public class QuizController {
    @Autowired
    private QuizService quizService;

    //adding quiz
    @PostMapping("/")
    public Quiz addQuiz(@RequestBody Quiz quiz) {
        return this.quizService.addQuiz(quiz);
    }

    @GetMapping("/{qid}")
//    public ResponseEntity<?>getQuiz(Long qid){
//        return ResponseEntity.ok(this.quizService.getQuiz(qid));
//    }
    public Quiz getQuiz(@PathVariable("qid") Long qid) {
        return this.quizService.getQuiz(qid);
    }

    @GetMapping("/category/{cid}")
    public List<Quiz> getQuizzesOfCategory(@PathVariable("cid") Long cid) {
        Category category = new Category();
        category.setCid(cid);
        return this.quizService.getQuizzesOfCategory(category);

    }
    //get active quizzes
@GetMapping("/active")
public List<Quiz> getActiveQuizzes(){
        return this.quizService.getActiveQuizzes();
}
//get active quizzes of category
    @GetMapping("/category/active/{cid}")
    public List<Quiz> getActiveQuizzesOfCategory(@PathVariable("cid")Long cid){
        Category category=new Category();
        category.setCid(cid);
        return this.quizService.getActiveQuizzesOfCategory(category);

    }


    @GetMapping("/")
    public ResponseEntity<?> getQuizzes() {
        return ResponseEntity.ok(this.quizService.getQuizzes());
    }

    //update quiz
    @PutMapping("/")
    public Quiz updateQuiz(@RequestBody Quiz quiz) {
        return this.quizService.updateQuiz(quiz);
    }

    @DeleteMapping("/{qid}")
    public void delete(@PathVariable("qid") Long qid) {
        this.quizService.deleteQuiz(qid);
    }

}

