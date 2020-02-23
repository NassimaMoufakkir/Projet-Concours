package com.fstg.TP2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Inscription;
import com.fstg.TP2.dao.InscriptionDao;
import com.fstg.TP2.service.facade.InscriptionService;

@Service
public class InscriptionServiceImpl implements InscriptionService {

	@Autowired
	public InscriptionDao inscriptionDao;
	
	@Override
	public Inscription findByReference(String reference) {
		return inscriptionDao.findByCne(reference);
	}

	@Override
	public List<Inscription> findAll() {
		return inscriptionDao.findAll();
	}

}
