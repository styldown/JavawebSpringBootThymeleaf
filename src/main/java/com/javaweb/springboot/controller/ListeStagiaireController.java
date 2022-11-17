package com.javaweb.springboot.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaweb.springboot.model.Formation;
import com.javaweb.springboot.model.Stagiaire;
import com.javaweb.springboot.service.FormationService;
import com.javaweb.springboot.service.StagiaireService;

@Controller
public class ListeStagiaireController {
	@Autowired
	FormationService formService;
	
	@Autowired
	StagiaireService stagService;
	
	@ModelAttribute("listStagiaire")
	public ArrayList<Stagiaire> addListStagiaireToModel(HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("idformation"));
		Formation form= formService.findById(id);
		ArrayList<Stagiaire> lisstagiaire=  stagService.findByFormation(form);
		return lisstagiaire;
	}
	
	@RequestMapping(value="/liststagiaire", method=RequestMethod.GET)
	public String ListStagiaire() {
		
		return "listStagiaire";
		
	}
	
	
}
