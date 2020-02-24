package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.NoteEtudiantConcours;

public interface NoteEtudiantConcoursService {
	public List<NoteEtudiantConcours> findByEtudiantCne(String cne);

	public List<NoteEtudiantConcours> findByConcours(Concours concours);

	public NoteEtudiantConcours findByNote(Double note);

}
