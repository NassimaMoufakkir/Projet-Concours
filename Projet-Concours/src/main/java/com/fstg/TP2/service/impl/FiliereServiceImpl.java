package com.fstg.TP2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fstg.TP2.bean.Departement;
import com.fstg.TP2.bean.Filiere;
import com.fstg.TP2.dao.FiliereDao;
import com.fstg.TP2.service.facade.FiliereService;

public class FiliereServiceImpl implements FiliereService {

	@Autowired
	private FiliereDao filiereDao;

	@Override
	public Filiere findByLibelle(String libelle) {
		return filiereDao.findByLibelle(libelle);
	}

	@Override
	public List<Filiere> findAll() {
		return filiereDao.findAll();
	}

	@Override
	public int save(Filiere filiere) {
		Filiere foundedFiliere = findByLibelle(filiere.getLibelle());
		if (foundedFiliere != null) {
			return -1;
		} else {
			filiereDao.save(filiere);
			return 1;
		}
	}

	@Override
	public int deleteByLibelle(String libelle) {
		Filiere foundedFiliere = findByLibelle(libelle);
		if(foundedFiliere!=null) {
			int resDepartemen = filiereDao.deleteByLibelle(libelle);
			return resDepartemen;
		}else {
			return -1;
		}
	}

}