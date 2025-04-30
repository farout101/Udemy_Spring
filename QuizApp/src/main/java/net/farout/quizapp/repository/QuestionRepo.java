package net.farout.quizapp.repository;

import net.farout.quizapp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Questions, Integer> {
    List<Questions> findQuestionsByCategory(String category);
}