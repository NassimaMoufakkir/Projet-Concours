package com.fstg.TP2.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.ModuleConcours;
import com.fstg.TP2.dao.ConcoursDao;
import com.fstg.TP2.service.facade.ConcoursService;
import com.fstg.TP2.service.facade.ConfigConcoursService;
import com.fstg.TP2.service.facade.ModuleConcoursService;

@Service
public class ConcoursServiceImpl implements ConcoursService {
	@Autowired
	private ConcoursDao concoursDao;
	@Autowired
	private ConfigConcoursService configConcoursService;
	@Autowired
	private ModuleConcoursService moduleConcoursService;

	@Override
	public Concours findByReference(String reference) {
		return concoursDao.findByReference(reference);
	}

	@Override
	public List<Concours> findAll() {
		return concoursDao.findAll();
	}

	@Override
	public int save(Concours concours) {
		Concours foundedConcours = findByReference(concours.getReference());
		if (foundedConcours != null) {
			return -1;
		}

		else {
			concoursDao.save(concours);
			moduleConcoursService.save(concours, concours.getModuleConcourss());
			return 1;
		}
	}

	@Override
	public List<Concours> findByAnnee(int annee) {
		return concoursDao.findByAnnee(annee);
	}

	@Override
	public List<Concours> findByFiliereLibelle(String libelle) {
		return concoursDao.findByFiliereLibelle(libelle);
	}

	@Override
	@Transactional
	public int deleteByReference(String reference) {
		int resConfig = configConcoursService.deleteByConcoursReference(reference);
		int resConcours = concoursDao.deleteByReference(reference);
		return resConcours * resConfig;
	}

}
