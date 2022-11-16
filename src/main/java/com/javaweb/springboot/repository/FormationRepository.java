package com.javaweb.springboot.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.springboot.model.Factory;
import com.javaweb.springboot.model.Formation;

public interface FormationRepository extends JpaRepository<Formation, Integer> {
	ArrayList<Formation> findByFactory(Factory fac);
}
