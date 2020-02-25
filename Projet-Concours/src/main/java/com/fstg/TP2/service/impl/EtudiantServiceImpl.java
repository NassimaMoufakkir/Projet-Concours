package com.fstg.TP2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.dao.EtudiantDao;
import com.fstg.TP2.service.facade.EtudiantService;

@Service
public class EtudiantServiceImpl implements EtudiantService{
	@Autowired
	public EtudiantDao etudiantDao;

	@Override
	public Etudiant findByCne(String cne) {
		return etudiantDao.findByCne(cne);
	}

	@Override
	public List<Etudiant> findAll() {
		return etudiantDao.findAll();
	}
	

}