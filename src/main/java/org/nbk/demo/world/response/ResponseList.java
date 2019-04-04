package org.nbk.demo.world.response;

import java.util.List;

import org.nbk.demo.world.model.City;

public class ResponseList {

	private List<City> cities;

	public ResponseList(List<City> cities) {
		super();
		this.cities = cities;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
}
