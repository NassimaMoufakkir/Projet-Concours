package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.NoteModuleConcours;

@Repository
public interface NoteModuleConcoursDao extends JpaRepository<NoteModuleConcours, Long> {
	public NoteModuleConcours findByInscriptionEtudiantCne(String cne);

}