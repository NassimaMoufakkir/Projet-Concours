package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstg.TP2.bean.NoteEtudiantModuleConcours;

public interface NoteEtudiantModuleConcoursDao extends  JpaRepository<NoteEtudiantModuleConcours, Long>{
	
	public List <NoteEtudiantModuleConcours> findAll();
	

}
