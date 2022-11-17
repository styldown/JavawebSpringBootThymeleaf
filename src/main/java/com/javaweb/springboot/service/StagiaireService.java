package com.javaweb.springboot.service;

import java.util.ArrayList;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.springboot.model.Formation;
import com.javaweb.springboot.model.Stagiaire;
import com.javaweb.springboot.repository.StagiaireRepository;

@Transactional
@Service
public class StagiaireService implements IStagiaireService {

	@Autowired
	StagiaireRepository stagiaireRepos;
	
	@Override
	public ArrayList<Stagiaire> findByFormation(Formation form) {
		return stagiaireRepos.findByFormation(form);
	}

	@Override
	public Stagiaire findById(int id) {
		Stagiaire stagiaire=stagiaireRepos.findById(id);
		return stagiaire;
	}

}
