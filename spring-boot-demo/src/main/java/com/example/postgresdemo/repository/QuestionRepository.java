package com.example.postgresdemo.repository;

import com.example.postgresdemo.model.Question;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	
	@Query(value = "SELECT * FROM questions  ",nativeQuery = true)
	public List<Question> getallDate();
	
}
