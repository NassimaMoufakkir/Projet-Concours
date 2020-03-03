package com.fstg.TP2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fstg.TP2.bean.Departement;
import com.fstg.TP2.dao.DepartementDao;
import com.fstg.TP2.service.facade.DepartementService;

public class DepartementServiceImpl implements DepartementService {

	@Autowired
	private DepartementDao departementDao;

	@Override
	public Departement findByReference(String reference) {
		return departementDao.findByReference(reference);
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
			return 1;
		}
	}

}
