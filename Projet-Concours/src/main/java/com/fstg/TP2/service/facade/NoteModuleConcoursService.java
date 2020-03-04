package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.NoteModuleConcours;

public interface NoteModuleConcoursService {
	public List<NoteModuleConcours> findAll();
	public NoteModuleConcours findByInscriptionEtudiantCne(String cne);
	public int save(NoteModuleConcours noteModuleConcours);
	
}
