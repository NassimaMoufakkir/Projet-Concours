package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Module;

public interface ModuleService {
	public Module findByLibelle(String libelle);
	public List<Module> findAll();
	public int save(Module module);
	public int delete(Module module);
}
