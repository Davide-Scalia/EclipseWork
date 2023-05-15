package com.mauriziano.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tabella {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String comp;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String archivio;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String num_a;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String numPagina;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String record_to_insert;
	
	
	
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public String getArchivio() {
		return archivio;
	}
	public void setArchivio(String archivio) {
		this.archivio = archivio;
	}
	public String getNum_a() {
		return num_a;
	}
	public void setNum_a(String num_a) {
		this.num_a = num_a;
	}
	public String getNumPagina() {
		return numPagina;
	}
	public void setNumPagina(String numPagina) {
		this.numPagina = numPagina;
	}
	public String getRecord_to_insert() {
		return record_to_insert;
	}
	public void setRecord_to_insert(String record_to_insert) {
		this.record_to_insert = record_to_insert;
	}
	
	
}
