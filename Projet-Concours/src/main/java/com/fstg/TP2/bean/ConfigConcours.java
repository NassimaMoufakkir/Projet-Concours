package com.fstg.TP2.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ConfigConcours {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private TypeDiplome typeDiplome;

	
	private double noteMin;
	private double nbreMaxAdmis;
	private double nbreMaxEcritAdmis;
	private double nbreMaxOraleAdmis;
	@ManyToOne
	private Concours concours;
	
	
	

	public TypeDiplome getTypeDiplome() {
		return typeDiplome;
	}
	public void setTypeDiplome(TypeDiplome typeDiplome) {
		this.typeDiplome = typeDiplome;
	}
	public ConfigConcours() {
		super();
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getNoteMin() {
		return noteMin;
	}

	public void setNoteMin(double noteMin) {
		this.noteMin = noteMin;
	}

	public double getNbreMaxAdmis() {
		return nbreMaxAdmis;
	}

	public void setNbreMaxAdmis(double nbreMaxAdmis) {
		this.nbreMaxAdmis = nbreMaxAdmis;
	}

	public double getNbreMaxEcritAdmis() {
		return nbreMaxEcritAdmis;
	}

	public void setNbreMaxEcritAdmis(double nbreMaxEcritAdmis) {
		this.nbreMaxEcritAdmis = nbreMaxEcritAdmis;
	}

	public double getNbreMaxOraleAdmis() {
		return nbreMaxOraleAdmis;
	}

	public void setNbreMaxOraleAdmis(double nbreMaxOraleAdmis) {
		this.nbreMaxOraleAdmis = nbreMaxOraleAdmis;
	}

	public Concours getConcours() {
		return concours;
	}

	public void setConcours(Concours concours) {
		this.concours = concours;
	}


	

	

}
