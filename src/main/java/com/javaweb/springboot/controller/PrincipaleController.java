package com.javaweb.springboot.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.javaweb.springboot.model.Authentification;
import com.javaweb.springboot.model.Factory;
import com.javaweb.springboot.model.Utilisateur;
import com.javaweb.springboot.service.AuthentificationService;
import com.javaweb.springboot.service.UtilisateurService;

@Controller
@SessionAttributes(value="utilisateur")
public class PrincipaleController {
	@Autowired
	AuthentificationService authentification;
	@Autowired
	UtilisateurService utilService;
	
	@ModelAttribute("utilisateur")
    public Utilisateur addMyUtilisateurToSessionScope() {
		Utilisateur utilisateur;
		String login = SecurityContextHolder.getContext().getAuthentication().getName();
		Authentification auth= authentification.findByLogin(login);
		utilisateur=auth.getUser();
		return utilisateur;
	}
	
	
	
	@RequestMapping(value={"/"} , method=RequestMethod.GET)
	public String principale(Model model, HttpSession session ) {
		Utilisateur util= (Utilisateur) model.getAttribute("utilisateur");
		Factory fac=util.getFactory();
		session.setAttribute("factory", fac);
		return "principale";
	}
	

}
