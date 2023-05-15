package com.belfiori.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belfiori.entities.Prodotto;

public interface ProdottoDAO extends JpaRepository<Prodotto, Integer>{

} 
