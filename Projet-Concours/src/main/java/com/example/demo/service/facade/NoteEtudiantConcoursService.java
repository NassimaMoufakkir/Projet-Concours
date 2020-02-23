package com.example.demo.service.facade;

import java.util.List;

import com.example.demo.bean.Concours;
import com.example.demo.bean.NoteEtudiantConcours;

public interface NoteEtudiantConcoursService {
	public List<NoteEtudiantConcours> findByEtudiantCne(String cne);
	public List<NoteEtudiantConcours> findByConcours(Concours concours);
	public NoteEtudiantConcours findByNote(Double note);

}
