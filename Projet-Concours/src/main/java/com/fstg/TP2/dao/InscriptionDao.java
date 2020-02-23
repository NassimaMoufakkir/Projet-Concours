package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.bean.Inscription;

@Repository
public interface InscriptionDao extends JpaRepository<Inscription, Long> {
	public Inscription findByCne(String reference);

	public List<Inscription> findAll();

}
