package com.example.demo.service.facade;

import java.util.List;

import com.example.demo.bean.Concours;
import com.example.demo.bean.ConfigConcours;

public interface ConfigConcoursService {
	public List<ConfigConcours> findByConcours(Concours concours);
	public List<ConfigConcours> findByModule(Module module);
	public int save(ConfigConcours configConcours);


}
