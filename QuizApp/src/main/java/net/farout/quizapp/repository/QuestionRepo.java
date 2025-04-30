package net.farout.quizapp.repository;

import net.farout.quizapp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Questions, Integer> {
    List<Questions> findQuestionsByCategory(String category);
    @Query(value = "SELECT * FROM questions q WHERE q.category=:category ORDER BY RANDOM() LIMIT :count", nativeQuery = true)
    List<Questions> findRandomQuestionsByCategory(String category, int count);
}