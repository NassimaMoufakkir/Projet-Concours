package com.fstg.TP2.service.facade;

import java.util.Date;
import java.util.List;

import com.fstg.TP2.bean.Concours;


public interface ConcoursService {
	public Concours findByReference(String reference);
	public List<Concours> findAll();
	public List<Concours> findByEtudiantCne(String cne);
	public List<Concours> findByAnneeConcours(Date anneeConcours);
	public int save(Concours concours);
	//public List<Concours> findConcours();

}
