package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ModuleDao extends JpaRepository <Module, Long> {
	public Module findByLibelle(String libelle);
	public List<Module> findAll();
}