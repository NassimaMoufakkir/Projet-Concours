package com.fstg.TP2.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.Module;
import com.fstg.TP2.service.facade.ModuleService;

@RestController
@RequestMapping("concours/module")

public class ModuleRest {
	@Autowired
	private ModuleService moduleService;
	
	@GetMapping("/libelle/{libelle}")
	public Module findByLibelle(@PathVariable String libelle) {
		return moduleService.findByLibelle(libelle);
	}

}
