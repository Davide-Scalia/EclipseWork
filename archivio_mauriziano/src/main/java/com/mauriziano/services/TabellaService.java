package com.mauriziano.services;

import java.util.List;

import com.mauriziano.entities.Tabella;

public interface TabellaService {
	List<Tabella> getDati();
	Tabella getDatiById(int id);
	Tabella addDati(Tabella T);
	void deleteDati(Tabella T);
}
