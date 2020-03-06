package com.fstg.TP2.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Module;
import com.fstg.TP2.bean.NoteModuleConcours;
import com.fstg.TP2.dao.NoteModuleConcoursDao;
import com.fstg.TP2.service.facade.ModuleService;
import com.fstg.TP2.service.facade.NoteModuleConcoursService;

@Service
public class NoteModuleConcoursServiceImpl implements NoteModuleConcoursService {

	@Autowired
	private NoteModuleConcoursDao noteModuleConcoursDao;

	@Override
	public List<NoteModuleConcours> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NoteModuleConcours findByInscriptionEtudiantCne(String cne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(NoteModuleConcours noteModuleConcours) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
