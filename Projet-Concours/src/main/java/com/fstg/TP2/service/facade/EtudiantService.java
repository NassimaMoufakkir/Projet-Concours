package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Etudiant;

public interface EtudiantService {
	public Etudiant findByCne(String cne);

	public List<Etudiant> findAll();

	public int save (Etudiant etudiant);

}
