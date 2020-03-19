package com.fstg.TP2.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Module;
import com.fstg.TP2.dao.ModuleDao;
import com.fstg.TP2.service.facade.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleDao moduleDao;

	@Override
	public Module findByLibelle(String libelle) {
		return moduleDao.findByLibelle(libelle);
	}

	@Override
	public List<Module> findAll() {
		return moduleDao.findAll();
	}

	@Override
	public int save(Module module) {
		Module foundedModule = findByLibelle(module.getLibelle());
		if (foundedModule != null) {
			return -1;
		} else {
			moduleDao.save(module);
			return 1;
		}
	}

	@Override
	@Transactional 
	public int deleteByLibelle(String libelle) {
		Module foundedModule = findByLibelle(libelle);
		if (foundedModule != null) {
			moduleDao.deleteByLibelle(libelle);
			return 1;
		} else {
			return -1;
		}
	}

}
