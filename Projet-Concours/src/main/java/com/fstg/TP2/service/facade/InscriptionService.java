package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.bean.Inscription;

public interface InscriptionService {
	public Inscription findByReference(String reference);

	public List<Inscription> findAll();

	public Inscription findByEtudiantCne(String cne);

	public Inscription findByEtudiantCneAndConcoursReference(String cne, String reference);
	
	public int save(Inscription inscription);

	public int deleteByReference(String reference);

	public int deleteByEtudiantCne(String cne);

	public int validate(List<Inscription> inscriptions);

	int save(Etudiant etudiant, List<Inscription> inscriptions);
	
	int result();

}
