package com.javaweb.springboot.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.javaweb.springboot.model.Factory;
import com.javaweb.springboot.model.Formation;
import com.javaweb.springboot.model.Stagiaire;
import com.javaweb.springboot.service.FormationService;
import com.javaweb.springboot.service.StagiaireService;

@Controller
public class AjouterStagiaireContoller {
	
	@Autowired
	FormationService formService;
	
	@Autowired
	StagiaireService stageService;

	@ModelAttribute("listFormation")
	public ArrayList<Formation> addListFormationToModel(HttpSession session){
		Factory fac=(Factory) session.getAttribute("factory");
		return formService.findByFactory(fac);
	}
	
	@GetMapping("/ajoutstagiaire")
	public String ajouStagiaireForm(Model model) {
		model.addAttribute("stagiaire", new Stagiaire());
		return "ajoutstagiaire";
		
	}
	
	@PostMapping("/ajoutstagiaire")
	public String ajoutStagiaireSubmit(@ModelAttribute Stagiaire stagiaire,HttpSession session) {
		stagiaire.setFactory((Factory)session.getAttribute("factory"));
		stageService.save(stagiaire);
		System.out.println(stagiaire.getNom());
		return "principale";
		
	}

}
