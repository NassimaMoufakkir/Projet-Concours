package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Departement;
import com.fstg.TP2.bean.Filiere;

public interface FiliereService {
	public Filiere findByLibelle(String reference);
	public List<Filiere> findByDepartementRefrence(String reference);
	public int deleteByDepartementReference(String reference);
	public int deleteByLibelle(String libelle);
	
	public List<Filiere> findAll();
	public int save(Departement departement , List<Filiere> filieres);
}
