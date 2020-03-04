package com.fstg.TP2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.dao.ConcoursDao;
import com.fstg.TP2.service.facade.ConcoursService;

@Service
public class ConcoursServiceImpl implements ConcoursService {
	@Autowired
	private ConcoursDao concoursDao;

	@Override
	public Concours findByReference(String reference) {
		return concoursDao.findByReference(reference);
	}

	@Override
	public List<Concours> findAll() {
		return concoursDao.findAll();
	}

	@Override
	public int save(Concours concours) {
		Concours foundedConcours = findByReference(concours.getReference());
		if (foundedConcours != null) {
			return -1;
		}

		else {
			concoursDao.save(concours);
			return 1;
		}
	}

	@Override
	public List<Concours> findByAnnee(int annee) {
		return concoursDao.findByAnnee(annee);
	}

	@Override
	public List<Concours> findByFiliereNom(String nom) {
		return concoursDao.findByFiliereNom(nom);
	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByReference(String reference) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
