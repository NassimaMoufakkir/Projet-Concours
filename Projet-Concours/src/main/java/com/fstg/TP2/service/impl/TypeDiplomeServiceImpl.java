package com.fstg.TP2.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Module;
import com.fstg.TP2.bean.TypeDiplome;
import com.fstg.TP2.dao.TypeDiplomeDao;
import com.fstg.TP2.service.facade.ModuleService;
import com.fstg.TP2.service.facade.TypeDiplomeService;

@Service
public class TypeDiplomeServiceImpl implements TypeDiplomeService {

	@Autowired
	private TypeDiplomeDao typeDiplomeDao;

	@Override
	public List<TypeDiplome> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(TypeDiplome typeDiplome) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TypeDiplome findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}


}
