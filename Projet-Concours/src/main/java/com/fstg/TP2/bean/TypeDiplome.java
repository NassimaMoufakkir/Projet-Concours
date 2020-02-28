package com.fstg.TP2.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class TypeDiplome {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	private String libelle;
	@ManyToOne
	private ConfigConcours configConcours;
	
	
	public TypeDiplome() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeDiplome(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	

}
