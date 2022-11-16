package com.javaweb.springboot.service;

import java.util.ArrayList;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.springboot.model.Factory;
import com.javaweb.springboot.model.Formation;
import com.javaweb.springboot.repository.FormationRepository;

@Transactional
@Service
public class FormationService implements IFormationService{
	@Autowired
	FormationRepository formation;

	@Override
	public ArrayList<Formation> findByFactory(Factory fac) {  
		return formation.findByFactory(fac);
	}

	@Override
	public Formation findById(int id) {
		return formation.findById(id);
	}
	
	
}
