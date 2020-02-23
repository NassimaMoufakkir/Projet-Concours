package com.fstg.TP2.service.impl;

package ma.techmind.projet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
			return 0;
		}
	}

	@Override
	public int delete(Module module) {
		Module foundedModule = findByLibelle(module.getLibelle());
		if (foundedModule != null) {
			moduleDao.delete(module);
			return 0;
		} else {
			return -1;
		}
	}

}
