package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.bean.Inscription;

public interface EtudiantService {
	public Etudiant findByCne(String cne);

	public List<Etudiant> findAll();

	public int deleteByCne(String cne);

	public int save(Etudiant etudiant);

	int save(Etudiant etudiant, List<Inscription> inscriptions);

}
