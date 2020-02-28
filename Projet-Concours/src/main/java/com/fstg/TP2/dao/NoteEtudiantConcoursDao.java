package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.NoteModuleConcours;


@Repository
public interface NoteEtudiantConcoursDao extends JpaRepository<NoteModuleConcours, Long> {
	public List<NoteModuleConcours> findByEtudiantCne(String cne);
	public List<NoteModuleConcours> findByConcours(Concours concours);
	public NoteModuleConcours findByNote(Double note);

}
