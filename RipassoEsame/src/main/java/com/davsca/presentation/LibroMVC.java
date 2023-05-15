package com.davsca.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.davsca.services.LibroService;

@Controller
@RequestMapping("")
public class LibroMVC {
	
	@Autowired
	private LibroService service;
	
	@GetMapping("libri")
	public String getLibri(Model m) {
		
		m.addAttribute("titolo", "I Nostri Libri");
		
		m.addAttribute("libri", service.getLibri());
		return "libri";
	}
}
