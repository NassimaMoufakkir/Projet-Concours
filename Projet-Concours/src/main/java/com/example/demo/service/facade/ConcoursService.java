package com.example.demo.service.facade;

import java.util.List;

import com.example.demo.bean.Concours;

public interface ConcoursService {
	public Concours findByReference(String reference);
	public List<Concours> findAll();
	public List<Concours> findByEtudiantCne(String cne);
	public int save(Concours concours);
	//public List<Concours> findConcours();

}
