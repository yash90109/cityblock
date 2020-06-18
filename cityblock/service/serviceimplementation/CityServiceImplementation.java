package com.mindtree.cityblock.service.serviceimplementation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.mindtree.cityblock.entity.City;
import com.mindtree.cityblock.service.CityService;

public class CityServiceImplementation implements CityService {

	@Override
	public Set<City> addCity(int cityid, String cityname) {
		Set<City> newcity=new TreeSet<City>();
		City citi=new City(cityid, cityname);
		newcity.add(citi);
		return newcity;
	}



}
