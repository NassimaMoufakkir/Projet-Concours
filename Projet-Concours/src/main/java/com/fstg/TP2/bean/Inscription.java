package com.fstg.TP2.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Inscription {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reference;
	@ManyToOne
	private Concours concours;
	@ManyToOne
	private Etudiant etudiant;
	@Temporal(TemporalType.DATE)
	private Date dateInscription;

	public Inscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inscription(Long id, String reference, Concours concours,  Date dateInscription) {
		super();
		this.id = id;
		this.reference = reference;
		this.concours = concours;
		this.dateInscription = dateInscription;
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

	public Concours getConcours() {
		return concours;
	}

	public void setConcours(Concours concours) {
		this.concours = concours;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

}