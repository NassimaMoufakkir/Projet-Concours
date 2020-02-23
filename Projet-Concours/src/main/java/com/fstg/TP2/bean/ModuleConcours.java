package com.fstg.TP2.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ModuleConcours {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Module module;
	@ManyToOne
	private Concours concours;
	private int coef;

	public ModuleConcours() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModuleConcours(Long id, Module module, Concours concours, int coef) {
		super();
		this.id = id;
		this.module = module;
		this.concours = concours;
		this.coef = coef;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Concours getConcours() {
		return concours;
	}

	public void setConcours(Concours concours) {
		this.concours = concours;
	}

	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}

}