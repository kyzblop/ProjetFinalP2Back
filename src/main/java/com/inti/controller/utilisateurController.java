package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.repository.IUtilisateurRepository;

@RestController
@RequestMapping("utilisateur")
public class utilisateurController {

	@Autowired
	IUtilisateurRepository iur;
}
