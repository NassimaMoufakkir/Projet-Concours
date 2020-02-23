package com.fstg.TP2.service.facade;

import java.util.List;

public interface ModuleService {
	public Module findByLibelle(String libelle);
	public List<Module> findAll();
	public int save(Module module);
	public int delete(Module module);
}
