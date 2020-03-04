package com.fstg.TP2.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Module;
import com.fstg.TP2.dao.NoteModuleConcoursDao;
import com.fstg.TP2.service.facade.ModuleService;

@Service
public class NoteModuleConcoursServiceImpl implements ModuleService {

	@Autowired
	private NoteModuleConcoursDao noteModuleConcoursDao;

	@Override
	public Module findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Module> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Module module) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
