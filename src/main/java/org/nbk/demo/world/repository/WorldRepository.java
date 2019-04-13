package org.nbk.demo.world.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.nbk.demo.world.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WorldRepository{
	
	@Autowired
	private EntityManager entityManager;
	
	public List<City> findAll(){
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.createQuery("from city", City.class).getResultList();
	}

	
}
