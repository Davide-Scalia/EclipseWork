package com.davsca.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davsca.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {
	
	Libro findByTitolo(String titolo);
	Libro findByAutore(String autore);

}
