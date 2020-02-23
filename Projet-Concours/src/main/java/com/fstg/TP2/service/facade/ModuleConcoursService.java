package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.ModuleConcours;

public interface ModuleConcoursService {
	public ModuleConcours findByModuleLibelle(String libelle);
	public List<ModuleConcours> findAll();
	public int save(ModuleConcours moduleConcours);
	public int delete(ModuleConcours moduleConcours);

}
