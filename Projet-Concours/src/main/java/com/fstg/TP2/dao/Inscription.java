package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.Etudiant;

@Repository
public interface Inscription extends JpaRepository<Inscription, Long> {
	public Inscription findByCne(String cne);

	public List<Inscription> findAll();

}
