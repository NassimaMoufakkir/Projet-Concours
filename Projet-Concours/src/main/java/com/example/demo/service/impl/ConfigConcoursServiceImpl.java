package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.bean.Concours;
import com.example.demo.bean.ConfigConcours;
import com.example.demo.dao.ConfigConcoursDao;
import com.example.demo.service.facade.ConcoursService;
import com.example.demo.service.facade.ConfigConcoursService;

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
