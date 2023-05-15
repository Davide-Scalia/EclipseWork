package com.belfiori.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belfiori.entities.Magazzino;
import com.belfiori.entities.Prodotto;
import com.belfiori.repos.MagazzinoDAO;
import com.belfiori.repos.ProdottoDAO;

@Service
public class MagazzinoServiceImpl implements MagazzinoService {

	@Autowired
	private MagazzinoDAO magazzinoDAO;
	
	@Autowired
	private ProdottoDAO prodottoDAO;
	@Override
	public List<Prodotto> getProdotti() {
		// TODO Auto-generated method stub
		return prodottoDAO.findAll();
	}

	@Override
	public Prodotto getProdottoById(int id) {
		// TODO Auto-generated method stub
		return prodottoDAO.getReferenceById(id);
	}

	@Override
	public Prodotto addProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		return prodottoDAO.save(p);
	}

	@Override
	public Prodotto updateProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		return prodottoDAO.save(p);
	}

	@Override
	public void deleteProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		prodottoDAO.delete(p);
	}

	@Override
	public List<Magazzino> getMagazzino() {
		// TODO Auto-generated method stub
		return magazzinoDAO.findAll();
	}

	@Override
	public Magazzino getMovimentoById(int id) {
		// TODO Auto-generated method stub
		return magazzinoDAO.getReferenceById(id);
	}

	@Override
	public List<Magazzino> getMovimentiByData(LocalDate d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Magazzino> getMovimentiByProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Magazzino caricaMagazzino(Prodotto p, int quantita) {
		// TODO Auto-generated method stub
		Magazzino m = new Magazzino();
		m.setProdotto(p);
		m.setQuantita(quantita);
		m.setData(LocalDate.now());
		return magazzinoDAO.save(m);
	}

	@Override
	public Magazzino scaricaMagazzino(Prodotto p, int quantita) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Magazzino updateMagazzino(Magazzino m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Magazzino caricaMagazzino(Magazzino m) {
		// TODO Auto-generated method stub
		return magazzinoDAO.save(m);
	}

	@Override
	public Magazzino scaricaMagazzino(Magazzino m) {
		// TODO Auto-generated method stub
		return magazzinoDAO.save(m);
	}


}
