package com.example.postgresdemo.repository;

import com.example.postgresdemo.model.Question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionCustomeRepository  {
	
	public List GetData() ;
}
