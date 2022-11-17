package com.javaweb.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaweb.springboot.model.Stagiaire;
import com.javaweb.springboot.service.StagiaireService;


@Controller
public class StagiaireController {
	
	@Autowired
	StagiaireService stagService;
	
	@ModelAttribute("stagiaire")
	public Stagiaire addStariaireToModel(HttpServletRequest request){
		int idStagiaire=Integer.parseInt(request.getParameter("idStagiaire"));
		Stagiaire stagiaire=stagService.findById(idStagiaire);
		System.out.println(stagiaire.getTel());
		return stagiaire ;
		
	}
	
	@RequestMapping(value="/stagiaire", method=RequestMethod.GET)
	public String stagiaire(Model model) {
		return "stagiaire.html";
	}
	

}
