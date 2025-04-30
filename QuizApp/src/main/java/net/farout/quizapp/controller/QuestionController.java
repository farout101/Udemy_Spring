package net.farout.quizapp.controller;

import net.farout.quizapp.model.Questions;
import net.farout.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping("/all")
    public ResponseEntity<List<Questions>> getAllQuestion() {
        try {
            return ResponseEntity.ok(questionService.getAllQuestions());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @RequestMapping("category/{category}")
    public ResponseEntity<List<Questions>> getQuestionsByCategory(@PathVariable String category) {
        try {
            return ResponseEntity.ok(questionService.getQuestionsByCategory(category));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @PostMapping("/")
    public ResponseEntity<String> addQuestion(@RequestBody Questions question) {
        try {
            questionService.addQuestion(question);
            return ResponseEntity.ok("Question add controller called");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while adding the question");
        }
    }
}
