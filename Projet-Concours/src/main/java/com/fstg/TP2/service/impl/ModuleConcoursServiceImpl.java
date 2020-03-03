package com.fstg.TP2.service.impl;

import java.util.List;

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

		// j'ajoute un attribut a ModuleConcours wla hi hadchi nit ?
		ModuleConcours foundedModuleConcours = findByModuleLibelle(moduleConcours.getModule().getLibelle());
		Module module = moduleService.findByLibelle(moduleConcours.getModule().getLibelle());
		Concours concours = concoursService.findByReference(moduleConcours.getConcours().getReference());
		// module == null wla module.getLibelle()==null ??
		if (module == null) {
			return -1;
		} else if (foundedModuleConcours != null) {
			return -2;
		} else if (concours.getReference() == null) {
			return -3;
		} else {
			moduleConcours.setConcours(concours);
			moduleConcours.setModule(module);
			moduleConcoursDao.save(moduleConcours);
			return 1;
		}
	}

	@Override
	public int delete(ModuleConcours moduleConcours) {
		ModuleConcours foundedModule = findByModuleLibelle(moduleConcours.getModule().getLibelle());
		if (foundedModule != null) {
			moduleConcoursDao.delete(moduleConcours);
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public List<ModuleConcours> findByConcoursReference(String reference) {
		return moduleConcoursDao.findByConcoursReference(reference);
	}

	@Override
	public List<ModuleConcours> findByConcoursReferenceAndModuleLibelle(String reference, String libelle) {
		return moduleConcoursDao.findByConcoursReferenceAndModuleLibelle(reference, libelle);
	}

}
