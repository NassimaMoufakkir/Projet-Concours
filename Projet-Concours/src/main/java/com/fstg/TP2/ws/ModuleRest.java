package com.fstg.TP2.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.Module;
import com.fstg.TP2.service.facade.ModuleService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
@RequestMapping("concours-api/module")

public class ModuleRest {

	@Autowired
	private ModuleService moduleService;

	@GetMapping("/libelle/{libelle}")
	public Module findByLibelle(@PathVariable String libelle) {
		return moduleService.findByLibelle(libelle);
	}

	@GetMapping("/")
	public List<Module> findAll() {
		return moduleService.findAll();
	}

	@PostMapping("/")
	public int save(@RequestBody Module module) {
		return moduleService.save(module);
	}

	@DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle) {
		return moduleService.deleteByLibelle(libelle);
	}

}
