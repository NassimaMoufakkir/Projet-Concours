package com.fstg.TP2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.NoteEtudiantConcours;
import com.fstg.TP2.dao.NoteEtudiantConcoursDao;
import com.fstg.TP2.service.facade.NoteEtudiantConcoursService;

public class NoteEtudiantConcoursServiceImpl implements NoteEtudiantConcoursService {
	@Autowired
	private NoteEtudiantConcoursDao noteEtudiantConcoursDao;
	

	@Override
	public List<NoteEtudiantConcours> findByEtudiantCne(String cne) {
		return noteEtudiantConcoursDao.findByEtudiantCne(cne);
	}

	@Override
	public List<NoteEtudiantConcours> findByConcours(Concours concours) {
		return noteEtudiantConcoursDao.findByConcours(concours);
	}

	@Override
	public NoteEtudiantConcours findByNote(Double note) {
		return noteEtudiantConcoursDao.findByNote(note);
	}

}
