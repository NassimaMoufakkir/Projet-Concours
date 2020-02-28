package com.fstg.TP2.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class NoteModuleConcours {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Inscription inscription;
	private Module module;
	private double note;
	private double noteAvecCoeff;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Inscription getInscription() {
		return inscription;
	}
	public void setInscription(Inscription inscription) {
		this.inscription = inscription;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	public double getNoteAvecCoeff() {
		return noteAvecCoeff;
	}
	public void setNoteAvecCoeff(double noteAvecCoeff) {
		this.noteAvecCoeff = noteAvecCoeff;
	}
	public NoteModuleConcours() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoteModuleConcours(Long id, Inscription inscription, Module module, double note, double noteAvecCoeff) {
		super();
		this.id = id;
		this.inscription = inscription;
		this.module = module;
		this.note = note;
		this.noteAvecCoeff = noteAvecCoeff;
	}
	
	
	
	
	

}
