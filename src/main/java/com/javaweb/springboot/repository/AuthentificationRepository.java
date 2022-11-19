package com.javaweb.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.springboot.model.Authentification;

public interface AuthentificationRepository extends JpaRepository<Authentification, Integer> {
	
	Authentification findByLogin(String login);
}
