package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.bean.Module;
import com.fstg.TP2.bean.NoteModuleConcours;

public interface NoteModuleConcoursService {

	public List<NoteModuleConcours> findAll();

	public NoteModuleConcours findByInscriptionEtudiantCne(String cne);

	public int save(NoteModuleConcours noteModuleConcours);

	public int calculNoteAvecCoef(Etudiant etudiant, Module module, Concours concours, double note);

	public NoteModuleConcours findByModuleLibelleAndInscriptionConcoursReference(String libelle, String reference);

	public NoteModuleConcours findByInscriptionEtudiantCneAndModuleLibelle(String cne, String libelle);

}
