package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Filiere;

public interface FiliereService {
	public Filiere findByLibelle(String reference);
	public List<Filiere> findAll();
	public int save(Filiere filiere);
	public int deleteAll();
	public int deleteByLibelle(String libelle);
}
