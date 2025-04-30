package net.farout.quizapp.service;

import net.farout.quizapp.model.Questions;
import net.farout.quizapp.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    public List<Questions> getAllQuestions() {
        return questionRepo.findAll();
    }

    public List<Questions> getQuestionsByCategory(String category) {
        return questionRepo.findQuestionsByCategory(category);
    }

    public void addQuestion(Questions question) {
        questionRepo.save(question);
    }
}
