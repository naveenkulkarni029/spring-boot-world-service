package org.nbk.demo.world.controller;

import java.util.List;

import org.nbk.demo.world.model.City;
import org.nbk.demo.world.response.ResponseCreated;
import org.nbk.demo.world.response.ResponseList;
import org.nbk.demo.world.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

	@Autowired
	private WorldService worldService;

	@GetMapping(value = "/world/demo", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseCreated> demo() {
		return ResponseEntity.ok(new ResponseCreated());
	}

	@GetMapping(value = "/world/list", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseList> worldList() {
		List<City> cities = worldService.getCities();
		return ResponseEntity.ok(new ResponseList(cities));
	}
}
