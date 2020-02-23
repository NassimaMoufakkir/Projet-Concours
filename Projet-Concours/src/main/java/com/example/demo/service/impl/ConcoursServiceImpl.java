package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Concours;
import com.example.demo.dao.ConcoursDao;
import com.example.demo.service.facade.ConcoursService;

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
	public List<Concours> findByEtudiantCne(String cne) {
		return null;
	}

	@Override
	public int save(Concours concours) {
		return 0;
	}



}
