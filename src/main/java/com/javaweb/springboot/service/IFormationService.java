package com.javaweb.springboot.service;

import java.util.ArrayList;

import com.javaweb.springboot.model.Factory;
import com.javaweb.springboot.model.Formation;

public interface IFormationService {
	
	Formation findById(int id);
	ArrayList<Formation> findByFactory(Factory fac);
	public Formation save(Formation formation);
}
