package com.fstg.TP2.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Concours {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reference;
	@Temporal(TemporalType.DATE)
	private Date dateConcours;
	@Temporal(TemporalType.DATE)
	private Date dateOrale;
	
	@Temporal(TemporalType.DATE)
	private Date dateEcrit;
	
	@Temporal(TemporalType.DATE)
	private Date dateAffichageResultatFinal;
	
	private int annee;
	

	
	private String description;

	@OneToOne
	private ConfigConcours configConcours;
	
	private int nbreEtudiantAdmisOrale;
	private int nbreEtudiantAdmisEcrit;
	private int nbreEtudiantAdmis;
	
	@ManyToOne
	private Filiere filiere;
	
	
	
	public Date getDateConcours() {
		return dateConcours;
	}

	public void setDateConcours(Date dateConcours) {
		this.dateConcours = dateConcours;
	}

	public Date getDateOrale() {
		return dateOrale;
	}

	public void setDateOrale(Date dateOrale) {
		this.dateOrale = dateOrale;
	}

	public Date getDateEcrit() {
		return dateEcrit;
	}

	public void setDateEcrit(Date dateEcrit) {
		this.dateEcrit = dateEcrit;
	}

	public Date getDateAffichageResultatFinal() {
		return dateAffichageResultatFinal;
	}

	public void setDateAffichageResultatFinal(Date dateAffichageResultatFinal) {
		this.dateAffichageResultatFinal = dateAffichageResultatFinal;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public ConfigConcours getConfigConcours() {
		return configConcours;
	}

	public void setConfigConcours(ConfigConcours configConcours) {
		this.configConcours = configConcours;
	}

	public int getNbreEtudiantAdmisOrale() {
		return nbreEtudiantAdmisOrale;
	}

	public void setNbreEtudiantAdmisOrale(int nbreEtudiantAdmisOrale) {
		this.nbreEtudiantAdmisOrale = nbreEtudiantAdmisOrale;
	}

	public int getNbreEtudiantAdmisEcrit() {
		return nbreEtudiantAdmisEcrit;
	}

	public void setNbreEtudiantAdmisEcrit(int nbreEtudiantAdmisEcrit) {
		this.nbreEtudiantAdmisEcrit = nbreEtudiantAdmisEcrit;
	}

	public int getNbreEtudiantAdmis() {
		return nbreEtudiantAdmis;
	}

	public void setNbreEtudiantAdmis(int nbreEtudiantAdmis) {
		this.nbreEtudiantAdmis = nbreEtudiantAdmis;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public Concours() {
		super();
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
