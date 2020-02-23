package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.bean.Concours;
import com.example.demo.bean.NoteEtudiantConcours;
import com.example.demo.dao.NoteEtudiantConcoursDao;
import com.example.demo.service.facade.NoteEtudiantConcoursService;

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
