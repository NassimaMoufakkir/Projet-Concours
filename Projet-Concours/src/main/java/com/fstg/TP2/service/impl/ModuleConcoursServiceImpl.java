package com.fstg.TP2.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.Module;
import com.fstg.TP2.bean.ModuleConcours;
import com.fstg.TP2.dao.ModuleConcoursDao;
import com.fstg.TP2.service.facade.ConcoursService;
import com.fstg.TP2.service.facade.ModuleConcoursService;
import com.fstg.TP2.service.facade.ModuleService;

@Service
public class ModuleConcoursServiceImpl implements ModuleConcoursService {

	@Autowired
	private ModuleConcoursDao moduleConcoursDao;
	@Autowired
	private ModuleService moduleService;
	@Autowired
	private ConcoursService concoursService;

	@Override
	public ModuleConcours findByModuleLibelle(String libelle) {
		return moduleConcoursDao.findByModuleLibelle(libelle);
	}

	@Override
	public List<ModuleConcours> findAll() {
		return moduleConcoursDao.findAll();
	}

	@Override
	public int save(ModuleConcours moduleConcours) {
		Module module = moduleService.findByLibelle(moduleConcours.getModule().getLibelle());
		Concours concours = concoursService.findByReference(moduleConcours.getConcours().getReference());
		if (module == null) {
			return -1;
		} else if (concours == null) {
			return -2;
		} else {
			moduleConcours.setConcours(concours);
			moduleConcours.setModule(module);
			moduleConcoursDao.save(moduleConcours);
			return 1;
		}
	}

	@Override
	public ModuleConcours findByConcoursReference(String reference) {
		return moduleConcoursDao.findByConcoursReference(reference);
	}

	@Override
	@Transactional
	public int deleteByModuleLibelle(String libelle) {
		return moduleConcoursDao.deleteByModuleLibelle(libelle);
	}

//	@Override
//	public void save(String reference, List<ModuleConcours> modulesConcours) {
//		for (int i = 0; i < modulesConcours.size(); i++) {
//			ModuleConcours m = modulesConcours.get(i);
//			m.getConcours().setReference(reference);
//			moduleConcoursDao.save(m);
//		}
//	}

	@Override
	public ModuleConcours findByConcoursReferenceAndModuleLibelle(String reference, String libelle) {
		return moduleConcoursDao.findByConcoursReferenceAndModuleLibelle(reference, libelle);

	}

	@Override
	public int deleteByConcoursReference(String reference) {
		return moduleConcoursDao.deleteByConcoursReference(reference);
	}

	@Override
	public ModuleConcours findByConcoursAnnee(int annee) {
		return moduleConcoursDao.findByConcoursAnnee(annee);

	}

	@Override
	public int save(Concours concours, List<ModuleConcours> modulesConcours) {
		for (ModuleConcours moduleConcours : modulesConcours) {
			moduleConcours.setConcours(concours);
			moduleConcoursDao.save(moduleConcours);
		}
		return 1;
	}

}
