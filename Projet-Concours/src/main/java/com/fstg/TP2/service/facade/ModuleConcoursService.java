package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.ModuleConcours;

public interface ModuleConcoursService {
	public ModuleConcours findByModuleLibelle(String libelle);
	public List<ModuleConcours> findAll();
	public List<ModuleConcours> findByConcoursReference(String reference);
	public List<ModuleConcours> findByConcoursReferenceAndModuleLibelle(String reference, String libelle);
	public int save(ModuleConcours moduleConcours);
	//public int delete(ModuleConcours moduleConcours);
	public int deleteAll();
	public int deleteByModuleLibelle(String libelle);

}
