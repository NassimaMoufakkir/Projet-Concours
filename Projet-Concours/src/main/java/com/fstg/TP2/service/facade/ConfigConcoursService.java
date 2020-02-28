package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.ConfigConcours;
import com.fstg.TP2.bean.Module;

public interface ConfigConcoursService {
	public List<ConfigConcours> findByConcoursReference(String reference);

	public List<ConfigConcours> findByModule(Module module);

	public int save(Concours concours, List<ConfigConcours> configConcours);

	public boolean validateConfigConcours(Concours concours, List<ConfigConcours> configConcours);

	public int deleteByConcoursReference(String reference);

}
