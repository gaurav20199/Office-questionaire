package com.example.demo.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Question;

public interface QuestionRepository extends JpaRepository<Question,Integer>{
	
	@Query(value = "SELECT *  FROM question Order by rand() Limit 8",nativeQuery = true)
	List<Question> findRandomQuestions();
			
}
