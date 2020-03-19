package com.fstg.TP2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.bean.Inscription;
import com.fstg.TP2.bean.Module;
import com.fstg.TP2.bean.ModuleConcours;
import com.fstg.TP2.bean.NoteModuleConcours;
import com.fstg.TP2.dao.NoteModuleConcoursDao;
import com.fstg.TP2.service.facade.InscriptionService;
import com.fstg.TP2.service.facade.ModuleConcoursService;
import com.fstg.TP2.service.facade.ModuleService;
import com.fstg.TP2.service.facade.NoteModuleConcoursService;

@Service
public class NoteModuleConcoursServiceImpl implements NoteModuleConcoursService {

	@Autowired
	private NoteModuleConcoursDao noteModuleConcoursDao;
	@Autowired
	private InscriptionService inscriptionService;
	@Autowired
	private ModuleService moduleService;
	@Autowired
	private ModuleConcoursService moduleConcoursService;

	@Override
	public List<NoteModuleConcours> findAll() {
		noteModuleConcoursDao.findAll();
		return null;
	}

	@Override
	public NoteModuleConcours findByInscriptionEtudiantCne(String cne) {
		noteModuleConcoursDao.findByInscriptionEtudiantCne(cne);
		return null;
	}

	@Override
	public int save(NoteModuleConcours noteModuleConcours) {
		Inscription inscription = inscriptionService
				.findByReference(noteModuleConcours.getInscription().getReference());
		Module module = moduleService.findByLibelle(noteModuleConcours.getModule().getLibelle());
		if (inscription == null) {
			return -1;
		} else if (module == null) {
			return -2;
		} else {
			noteModuleConcours.setModule(module);
			noteModuleConcours.setInscription(inscription);
			noteModuleConcoursDao.save(noteModuleConcours);
			return 1;
		}
	}

	@Override
	public int calculNoteAvecCoef(Etudiant etudiant, Module module, Concours concours, double note) {

		ModuleConcours moduleConcours = moduleConcoursService
				.findByConcoursReferenceAndModuleLibelle(concours.getReference(), module.getLibelle());
		Inscription inscription = inscriptionService.findByEtudiantCneAndConcoursReference(etudiant.getCne(),concours.getReference());
		if (moduleConcours == null) {
			return -1;
		} else if (inscription == null) {
			return -2;
		} else {
			NoteModuleConcours noteModuleConcours = new NoteModuleConcours();
			noteModuleConcours.setModule(module);
			noteModuleConcours.setNote(note);
			noteModuleConcours.setNoteAvecCoeff(note * moduleConcours.getCoef());
			noteModuleConcours.setInscription(inscription);
			noteModuleConcoursDao.save(noteModuleConcours);
			return 1;
		}

	}

	@Override
	public NoteModuleConcours findByModuleLibelleAndInscriptionConcoursReference(String libelle, String reference) {
		return noteModuleConcoursDao.findByModuleLibelleAndInscriptionConcoursReference(libelle, reference);
	}

	@Override
	public NoteModuleConcours findByInscriptionEtudiantCneAndModuleLibelle(String cne, String libelle) {
		return noteModuleConcoursDao.findByInscriptionEtudiantCneAndModuleLibelle(cne, libelle);
	}

}
