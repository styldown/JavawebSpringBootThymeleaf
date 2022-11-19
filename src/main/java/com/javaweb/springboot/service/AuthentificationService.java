package com.javaweb.springboot.service;

import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.springboot.model.Authentification;
import com.javaweb.springboot.repository.AuthentificationRepository;

@Transactional
@Service("authentificationService")
public class AuthentificationService implements IAuthentificationService {
	@Autowired
	AuthentificationRepository auth;
	
	@Override
	public Authentification findByLogin(String login) {
		return auth.findByLogin(login);
	}

}
