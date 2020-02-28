package com.fstg.TP2.bean;

//okkk ù

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Concours {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reference;
	@Temporal(TemporalType.DATE)
	private Date anneeConcours;
	@OneToMany //(mappedBy = "concours")
	private List<Etudiant> etudiants;
	private String description;

	public Concours() {
		super();
	}

	public Concours(Long id, String reference, Date anneeConcours, List<Etudiant> etudiants, String description) {
		super();
		this.id = id;
		this.reference = reference;
		this.anneeConcours = anneeConcours;
		this.etudiants = etudiants;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getAnneeConcours() {
		return anneeConcours;
	}

	public void setAnneeConcours(Date anneeConcours) {
		this.anneeConcours = anneeConcours;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
