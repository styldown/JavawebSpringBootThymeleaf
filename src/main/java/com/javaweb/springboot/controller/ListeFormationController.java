package com.javaweb.springboot.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaweb.springboot.model.Factory;
import com.javaweb.springboot.model.Formation;
import com.javaweb.springboot.service.FormationService;

@Controller
public class ListeFormationController {
	
	@Autowired
	FormationService listService;

	@ModelAttribute("listFormation")
	public ArrayList<Formation> addListFormationToModel(HttpSession session){
		Factory fac=(Factory) session.getAttribute("factory");
		return listService.findByFactory(fac);
	}
	
	
	
	@RequestMapping(value={"/listformation"} , method=RequestMethod.GET)
	public String principale(Model model) {
		@SuppressWarnings("unchecked")
		ArrayList<Formation> list=(ArrayList<Formation>)model.getAttribute("listFormation");
		for(Formation form:list) {
			System.out.println(form.getNom());
		}
		
		return "listeformation";
	}

}
