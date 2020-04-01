package com.fstg.TP2.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Departement;
import com.fstg.TP2.bean.Filiere;
import com.fstg.TP2.dao.DepartementDao;
import com.fstg.TP2.service.facade.DepartementService;
import com.fstg.TP2.service.facade.FiliereService;

@Service
public class DepartementServiceImpl implements DepartementService {

	@Autowired
	private DepartementDao departementDao;
	@Autowired
	private FiliereService filiereService;

	@Override
	public Departement findByReference(String reference) {
		return departementDao.findByRefrence(reference);
	}

	@Override
	public List<Departement> findAll() {
		return departementDao.findAll();
	}

	@Override
	public int save(Departement departement) {
		Departement foundedDepartement = findByReference(departement.getRefrence());
		if (foundedDepartement != null) {
			return -1;
		} else {
			departementDao.save(departement);
			filiereService.save(departement, departement.getFilieres());
			return 1;
		}
	}

	@Override
	@Transactional
	public int deleteByReference(String reference) {
		Departement foundedDepartement = findByReference(reference);
		if(foundedDepartement!=null) {
			int res1 = filiereService.deleteByDepartementReference(reference);
			int res2 = departementDao.deleteByRefrence(reference);
			return res1+res2;
		}else {
			return -1;
		}
	}
}
