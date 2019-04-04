package org.nbk.demo.world.service;

import java.util.List;

import org.nbk.demo.world.model.City;
import org.nbk.demo.world.repository.WorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorldServiceImpl implements WorldService{

	@Autowired
	private WorldRepository worldRepository;
	
	@Override
	public List<City> getCities() {
		return worldRepository.findAll();
	}

}
