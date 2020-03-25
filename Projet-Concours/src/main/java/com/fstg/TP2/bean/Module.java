package com.fstg.TP2.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Module implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;
	@OneToMany(mappedBy = "module")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<ModuleConcours> moduleConcourss = new ArrayList<ModuleConcours>();

	public Module() {
		super();
	}

	public Module(Long id, String libelle, List<ModuleConcours> moduleConcourss) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.moduleConcourss = moduleConcourss;
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

	public List<ModuleConcours> getModuleConcourss() {
		return moduleConcourss;
	}

	public void setModuleConcourss(List<ModuleConcours> moduleConcourss) {
		this.moduleConcourss = moduleConcourss;
	}

}
