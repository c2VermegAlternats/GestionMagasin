package com.magasin.entity;

import java.awt.Color;

public class Vetment {

	private Color couleur;
	private Genre genre;
	private String marque;
	
	public Vetment() {
		super();
	}

	public Vetment(Color couleur, Genre genre, String marque) {
		super();
		this.couleur = couleur;
		this.genre = genre;
		this.marque = marque;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	
	
}
