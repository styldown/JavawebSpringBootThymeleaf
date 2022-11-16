package com.javaweb.springboot.service;

import com.javaweb.springboot.model.Authentification;

public interface IAuthentificationService {
	Authentification findByLogin(String login);
}
