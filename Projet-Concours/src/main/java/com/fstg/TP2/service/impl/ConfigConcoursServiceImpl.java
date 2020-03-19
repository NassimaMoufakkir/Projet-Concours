package com.fstg.TP2.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.ConfigConcours;
import com.fstg.TP2.dao.ConfigConcoursDao;
import com.fstg.TP2.service.facade.ConcoursService;
import com.fstg.TP2.service.facade.ConfigConcoursService;
import com.fstg.TP2.service.facade.EtudiantService;
@Service
public class ConfigConcoursServiceImpl implements ConfigConcoursService {
	@Autowired
	private ConfigConcoursDao configConcoursDao;
	@Autowired
	private ConcoursService concoursService;
	@Autowired
	private EtudiantService etudiantService;

	@Override
	public List<ConfigConcours> findByConcoursReference(String reference) {
		return configConcoursDao.findByConcoursReference(reference);
	}

	@Override
	public int save(Concours concours, List<ConfigConcours> configConcours) {
		//Concours foundedConcours = findByConcoursReference(concours.getReference());
		return 0;
		
	}

	@Override
	public boolean validateConfigConcours(Concours concours, List<ConfigConcours> configConcours) {
		List<ConfigConcours> valideConcours = configConcours.stream()
				.filter(cc -> concoursService.findByReference(cc.getConcours().getReference()) != null).collect(Collectors.toList());
		return valideConcours.size() == configConcours.size();
	}

	@Override
	@Transactional
	public int deleteByConcoursReference(String reference) {
		return configConcoursDao.deleteByConcoursReference(reference);
	}

	@Override
	public List<ConfigConcours> findByTypeDiplomeLibelle(String libelle) {
		return configConcoursDao.findByTypeDiplomeLibelle(libelle);
	}


}
