package com.mauriziano.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauriziano.entities.Tabella;

public interface TabellaDAO extends JpaRepository <Tabella, Integer> {

}
