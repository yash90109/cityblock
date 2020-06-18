package com.mindtree.cityblock.service;

import java.util.Set;

import com.mindtree.cityblock.entity.City;

public interface CityService {

	Set<City> addCity(int cityid, String cityname);

}
