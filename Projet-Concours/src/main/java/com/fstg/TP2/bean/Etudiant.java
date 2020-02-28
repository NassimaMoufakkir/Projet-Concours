package com.fstg.TP2.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//hello
@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cne;
	private String nom;
	private String prenom;
	private int age;

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(Long id, String cne, String nom, String prenom, int age) {
		super();
		this.id = id;
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}