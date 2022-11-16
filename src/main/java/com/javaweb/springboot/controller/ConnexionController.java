package com.javaweb.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConnexionController {
	private String message;
	@RequestMapping(value = {"/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		//Session session = null;
		model.addAttribute("message", message);

		return "connexion";
	}


}
