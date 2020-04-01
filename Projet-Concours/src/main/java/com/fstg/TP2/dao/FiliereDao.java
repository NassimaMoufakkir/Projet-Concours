package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.Filiere;

@Repository
public interface FiliereDao extends JpaRepository<Filiere, Long> {
	Filiere findByLibelle(String libelle);
	public int deleteByLibelle(String libelle);
	public int deleteByDepartementRefrence(String reference);
	public List<Filiere> findByDepartementRefrence(String reference);
}
