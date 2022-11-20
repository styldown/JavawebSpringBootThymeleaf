package com.javaweb.springboot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javaweb.springboot.model.Factory;
import com.javaweb.springboot.model.Formation;
import com.javaweb.springboot.service.FormationService;

@Controller
public class AjoutFormationController {
	
	@Autowired
	FormationService formService;
	
	@GetMapping("/ajoutformation")
	public String ajoutFormation(Model model) {
		model.addAttribute("formation", new Formation() );
		return "ajoutformation";	
	}
	
	@PostMapping("/ajoutformation")
	public ModelAndView ajoutFormationSubmit(@ModelAttribute Formation formation,HttpSession session) {
		Factory factory= (Factory)session.getAttribute("factory");
		System.out.println(factory.getNom());
		formation.setFactory(factory);
		formService.save(formation);
		return new ModelAndView("redirect:/listformation");
	}
	
}
