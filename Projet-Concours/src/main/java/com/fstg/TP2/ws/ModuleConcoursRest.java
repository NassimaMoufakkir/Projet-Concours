package com.fstg.TP2.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.ModuleConcours;
import com.fstg.TP2.service.facade.ModuleConcoursService;

@RestController
@RequestMapping("concours-api/module-concours")
public class ModuleConcoursRest {

	@Autowired
	private ModuleConcoursService moduleConcoursService;

	@GetMapping("/libelle/{libelle}")
	public ModuleConcours findByModuleLibelle(String libelle) {
		return moduleConcoursService.findByModuleLibelle(libelle);
	}

	@GetMapping("/")
	public List<ModuleConcours> findAll() {
		return moduleConcoursService.findAll();
	}

	/*public int save(ModuleConcours moduleConcours) {
		return moduleConcoursService.save(moduleConcours);
	}

	public int delete(ModuleConcours moduleConcours) {
		return moduleConcoursService.delete(moduleConcours);
	}*/
	
	
}
