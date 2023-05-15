package com.davsca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.davsca.entities.Libro;
import com.davsca.repos.LibroDAO;

@Service
public class LibroServiceImpl implements LibroService {
	
	@Autowired
	private LibroDAO dao;

	@Override
	public List<Libro> getLibri() {
		return dao.findAll();
	}

	@Override
	public Libro getLibroById(int Id) {
		return dao.getReferenceById(Id);
	}

	@Override
	public void addLibro(Libro l) {
		dao.save(l);
	}

	@Override
	public void deleteLibro(Libro l) {
		dao.delete(l);
	}

	@Override
	public Libro getLibroByTitolo(String titolo) {
		// TODO Auto-generated method stub
		return dao.findByTitolo(titolo);
	}
	
	@Override
	public Libro getLibroByAutore(String autore) {
		// TODO Auto-generated method stub
		return dao.findByAutore(autore);
	}

}
