package com.javaweb.springboot.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.springboot.model.Utilisateur;
import com.javaweb.springboot.repository.UtilisateurRepository;

@Transactional
@Service
public class UtilisateurService implements IUtilisateurService{
	@Autowired 
	UtilisateurRepository util;
	@Override
	public Utilisateur findById(String id) {
		return util.findById(id);
	}
	@Override
	public void save(Utilisateur utilisateur) {
		util.save(utilisateur);
		
	}
	
}
