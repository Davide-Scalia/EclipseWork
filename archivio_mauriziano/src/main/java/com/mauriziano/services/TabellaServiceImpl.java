package com.mauriziano.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mauriziano.entities.Tabella;
import com.mauriziano.repos.TabellaDAO;

@Service
public class TabellaServiceImpl implements TabellaService {
	
	@Autowired
	private TabellaDAO tabellaDAO;

	@Override
	public List<Tabella> getDati() {
		return tabellaDAO.findAll();
	}

	@Override
	public Tabella getDatiById(int id) {
		// TODO Auto-generated method stub
		return tabellaDAO.getReferenceById(id);
	}

	@Override
	public Tabella addDati(Tabella T) {
		// TODO Auto-generated method stub
		return tabellaDAO.save(T);
	}

	@Override
	public void deleteDati(Tabella T) {
		// TODO Auto-generated method stub
		tabellaDAO.delete(T);
	}

}
