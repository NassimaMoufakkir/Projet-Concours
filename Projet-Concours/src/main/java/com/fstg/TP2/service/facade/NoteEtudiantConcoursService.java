package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.NoteModuleConcours;

public interface NoteEtudiantConcoursService {
	public List<NoteModuleConcours> findByEtudiantCne(String cne);

	public List<NoteModuleConcours> findByConcours(Concours concours);

	public NoteModuleConcours findByNote(Double note);

}
