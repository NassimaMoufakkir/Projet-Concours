package com.fstg.TP2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.ConfigConcours;
import com.fstg.TP2.dao.ConfigConcoursDao;
import com.fstg.TP2.service.facade.ConcoursService;
import com.fstg.TP2.service.facade.ConfigConcoursService;

public class ConfigConcoursServiceImpl implements ConfigConcoursService {
	@Autowired
	private ConfigConcoursDao configConcoursDao;
	@Autowired
	private ConcoursService concoursService;

	@Override
	public List<ConfigConcours> findByConcours(Concours concours) {
		return configConcoursDao.findByConcours(concours);
	}

	@Override
	public List<ConfigConcours> findByModule(Module module) {
		return configConcoursDao.findByModule(module);
	}

	@Override
	public int save(ConfigConcours configConcours) {
		return 0;
	}
	

}
