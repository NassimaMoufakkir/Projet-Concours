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
		return typeDiplomeDao.findAll();
	}

	@Override
	public int save(TypeDiplome typeDiplome) {
		TypeDiplome foundedTypeDiplome = findByLibelle(typeDiplome.getLibelle());
		if (foundedTypeDiplome != null)
			return -1;
		else {
			typeDiplomeDao.save(foundedTypeDiplome);
			return 1;
		}
	}

	@Override
	public TypeDiplome findByLibelle(String libelle) {
		return typeDiplomeDao.findByLibelle(libelle);
	}

}
