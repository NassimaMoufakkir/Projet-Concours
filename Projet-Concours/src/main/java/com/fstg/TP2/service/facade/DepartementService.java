package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Departement;
import com.fstg.TP2.bean.Filiere;

public interface DepartementService {
	int save(Departement departement);
	Departement findByReference(String reference);
	List<Departement> findAll();
	public int deleteByReference(String reference);
}