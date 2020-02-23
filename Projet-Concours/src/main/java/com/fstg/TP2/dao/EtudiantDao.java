package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.Etudiant;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant, Long> {
	public Etudiant findByCne(String cne);

	public List<Etudiant> findAll();

}