package com.example.postgresdemo.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.example.postgresdemo.repository.QuestionCustomeRepository;
import com.example.postgresdemo.repository.QuestionRepository;

public class QuestionRepositoryImpl implements QuestionCustomeRepository{

	

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List GetData() {
		// TODO Auto-generated method stub
		int i=1;
		Query query = entityManager.createNativeQuery("SELECT a FROM questions a WHERE a.id = '"+i+"'");
		return query.getResultList() ;
	}

}
