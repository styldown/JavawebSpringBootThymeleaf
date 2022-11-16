package com.javaweb.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaweb.springboot.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
	
	Utilisateur findById(String id);
	 
}

