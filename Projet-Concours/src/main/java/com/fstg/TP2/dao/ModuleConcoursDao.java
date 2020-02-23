package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.ModuleConcours;


@Repository
public interface ModuleConcoursDao extends JpaRepository <ModuleConcours, Long> {
	public ModuleConcours findByModuleLibelle(String libelle);
	public List<ModuleConcours> findAll();
}