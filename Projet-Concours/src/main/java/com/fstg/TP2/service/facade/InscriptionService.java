package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Inscription;

public interface InscriptionService {
	public Inscription findByReference(String reference);
	public List<Inscription> findAll();
	public List<Inscription> findByEtudiantCne(String cne);
	public List<Inscription> findByEtudiantCneConcoursReference(String cne, String reference);
	public int save(Inscription inscription);
	public int deleteAll();
	public int deleteByReference(String reference);
}
