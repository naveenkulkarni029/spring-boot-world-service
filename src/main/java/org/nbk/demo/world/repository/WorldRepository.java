package org.nbk.demo.world.repository;

import org.nbk.demo.world.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorldRepository extends JpaRepository<City, Integer>{

	
}
