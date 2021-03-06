package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.bean.Inscription;

public interface InscriptionService {

	public List<Inscription> findAll();

	public Inscription findByReference(String reference);

	public List <Inscription> findByEtudiantCne(String cne);

	public Inscription findByEtudiantCneAndConcoursReference(String cne, String reference);

	public int deleteByReference(String reference);

	public int deleteByEtudiantCne(String cne);

	int save(Etudiant etudiant, List<Inscription> inscriptions);
}
