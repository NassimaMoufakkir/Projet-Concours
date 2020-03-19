package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.ModuleConcours;

public interface ModuleConcoursService {

	public ModuleConcours findByModuleLibelle(String libelle);

	public List<ModuleConcours> findAll();

	public ModuleConcours findByConcoursReference(String reference);

	public ModuleConcours findByConcoursReferenceAndModuleLibelle(String reference, String libelle);

	public int save(ModuleConcours moduleConcours);

	public int deleteByModuleLibelle(String libelle);

	public void save(String reference, List<ModuleConcours> modulesConcours);

}
