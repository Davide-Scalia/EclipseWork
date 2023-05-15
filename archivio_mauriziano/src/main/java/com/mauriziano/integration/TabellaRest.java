package com.mauriziano.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauriziano.entities.Tabella;
import com.mauriziano.services.TabellaService;

@RestController
@RequestMapping("api")
public class TabellaRest {
	@Autowired
	private TabellaService service;
	
	@GetMapping("1")
	public List<Tabella>getProdotti(){
		return service.getDati();
	}
	
	@PostMapping("2")
	public Tabella addProdotto(@RequestBody Tabella T) {
		return service.addDati(T);
	}
	
//	@PostMapping("listatabella")
//	public void addListaProdotto(@RequestBody List<Prodotto> lista) {
//		
//		for (Prodotto prodotto : lista) {
//			service.addProdotto(prodotto);
//		}
//		
//	}
	
}
