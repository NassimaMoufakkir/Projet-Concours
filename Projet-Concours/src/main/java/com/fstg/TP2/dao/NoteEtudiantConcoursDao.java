package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.NoteEtudiantConcours;


@Repository
public interface NoteEtudiantConcoursDao extends JpaRepository<NoteEtudiantConcours, Long> {
	public List<NoteEtudiantConcours> findByEtudiantCne(String cne);
	public List<NoteEtudiantConcours> findByConcours(Concours concours);
	public NoteEtudiantConcours findByNote(Double note);

}
