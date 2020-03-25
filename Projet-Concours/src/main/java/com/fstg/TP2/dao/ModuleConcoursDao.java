package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.ModuleConcours;

@Repository
public interface ModuleConcoursDao extends JpaRepository<ModuleConcours, Long> {

	public ModuleConcours findByModuleLibelle(String libelle);

	public List<ModuleConcours> findByConcoursReference(String reference);
	
	public List<ModuleConcours> findByConcoursAnnee(int annee);

	public ModuleConcours findByConcoursReferenceAndModuleLibelle(String reference, String libelle);

	public int deleteByModuleLibelle(String libelle);
	
	public int deleteByConcoursReference(String reference);


}
