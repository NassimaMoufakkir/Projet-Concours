package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Departement;

public interface DepartementService {
	int save(Departement departement);
	Departement findByReference(String reference);
	List<Departement> findAll();
	public int deleteAll();
	public int deleteByReference(String reference);
}