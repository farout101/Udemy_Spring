package net.farout.quizapp.service;

import net.farout.quizapp.model.Questions;
import net.farout.quizapp.model.Quiz;
import net.farout.quizapp.repository.QuestionRepo;
import net.farout.quizapp.repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizRepo quizRepo;
    @Autowired
    QuestionRepo questionRepo;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Questions> questions = questionRepo.findRandomQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizRepo.save(quiz);

        return ResponseEntity.ok("Quiz created");
    }

    public ResponseEntity<Quiz> getQuizById(int id) {
        Optional<Quiz> quiz = quizRepo.findById(id);
        return quiz.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
