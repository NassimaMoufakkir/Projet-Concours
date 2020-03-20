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

//try 


@Service
public class ConfigConcoursServiceImpl implements ConfigConcoursService {
	@Autowired
	private ConfigConcoursDao configConcoursDao;
	@Autowired
	private ConcoursService concoursService;

	@Override
	public List<ConfigConcours> findByConcoursReference(String reference) {
		return configConcoursDao.findByConcoursReference(reference);
	}

	@Override
	public void save(Concours concours, List<ConfigConcours> configConcours) {
		for (ConfigConcours c : configConcours) {
			configConcoursDao.save(c);
			c.setConcours(concours);
		}

	}

	@Override
	public boolean validateConfigConcours(Concours concours, List<ConfigConcours> configConcours) {
		List<ConfigConcours> valideConcours = configConcours.stream()
				.filter(cc -> concoursService.findByReference(cc.getConcours().getReference()) != null)
				.collect(Collectors.toList());
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
