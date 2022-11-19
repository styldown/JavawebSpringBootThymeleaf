package com.javaweb.springboot.service;

import java.util.ArrayList;
import com.javaweb.springboot.model.Formation;
import com.javaweb.springboot.model.Stagiaire;

public interface IStagiaireService {
	ArrayList<Stagiaire> findByFormation(Formation form);
	Stagiaire findById(int id);
	void save(Stagiaire stag);
}
