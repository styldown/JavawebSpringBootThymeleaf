package com.javaweb.springboot.service;

import com.javaweb.springboot.model.Utilisateur;

public interface IUtilisateurService {
	Utilisateur findById(String id);
	void save(Utilisateur utilisateur);
}	
