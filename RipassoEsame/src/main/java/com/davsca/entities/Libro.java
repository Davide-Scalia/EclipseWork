package com.davsca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "corsi")
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titolo;
	private String autore;
	private String genere;
	private String nPagine;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getnPagine() {
		return nPagine;
	}
	public void setnPagine(String nPagine) {
		this.nPagine = nPagine;
	}
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	public Libro(int id, String titolo, String autore, String genere, String nPagine) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.genere = genere;
		this.nPagine = nPagine;
	}
	
	
	
}
