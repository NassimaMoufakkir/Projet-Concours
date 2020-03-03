package com.fstg.TP2.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.Concours;

@Repository
public interface ConcoursDao extends JpaRepository<Concours, Long> {
	public Concours findByReference(String reference);

	public List<Concours> findByAnnee(int annee);

	public List<Concours> findByFiliereNom(String nom);

	public List<Concours> findAll();

}