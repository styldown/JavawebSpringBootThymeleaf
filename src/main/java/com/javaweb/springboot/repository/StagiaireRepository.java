package com.javaweb.springboot.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.springboot.model.Formation;
import com.javaweb.springboot.model.Stagiaire;

public interface StagiaireRepository extends JpaRepository<Stagiaire, Integer> {
	ArrayList<Stagiaire> findByFormation(Formation form);
}
