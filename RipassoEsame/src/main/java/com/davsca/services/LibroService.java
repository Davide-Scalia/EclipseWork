package com.davsca.services;

import java.util.List;

import com.davsca.entities.Libro;


public interface LibroService {
	
	List<Libro> getLibri();
	Libro getLibroById(int Id);
	void addLibro(Libro l);
	void deleteLibro(Libro l);
	Libro getLibroByTitolo(String titolo);
	Libro getLibroByAutore(String autore);
}
