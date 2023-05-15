package com.belfiori.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belfiori.entities.Magazzino;

public interface MagazzinoDAO extends JpaRepository<Magazzino, Integer>{

}
