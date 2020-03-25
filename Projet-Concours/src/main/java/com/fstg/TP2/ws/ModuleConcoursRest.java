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

import com.fstg.TP2.bean.ModuleConcours;
import com.fstg.TP2.service.facade.ModuleConcoursService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
@RequestMapping("concours-api/module-concours")
public class ModuleConcoursRest {

	@Autowired
	private ModuleConcoursService moduleConcoursService;

	@GetMapping("/libelle/{libelle}")
	public ModuleConcours findByModuleLibelle(@PathVariable String libelle) {
		return moduleConcoursService.findByModuleLibelle(libelle);
	}

	@GetMapping("/")
	public List<ModuleConcours> findAll() {
		return moduleConcoursService.findAll();
	}

	@GetMapping("/concours/reference/{reference}")
	public List<ModuleConcours> findByConcoursReference(@PathVariable String reference) {
		return moduleConcoursService.findByConcoursReference(reference);
	}
	
	@GetMapping("/concours/annee/{annee}")
	public List<ModuleConcours> findByConcoursAnnee(@PathVariable int annee) {
		return moduleConcoursService.findByConcoursAnnee(annee);
	}

	@GetMapping("/concours/reference/{reference}/module/libelle/{libelle}")
	public ModuleConcours findByConcoursReferenceAndModuleLibelle(@PathVariable String reference,
			@PathVariable String libelle) {
		return moduleConcoursService.findByConcoursReferenceAndModuleLibelle(reference, libelle);
	}

	@PostMapping("/")
	public int save(@RequestBody ModuleConcours moduleConcours) {
		return moduleConcoursService.save(moduleConcours);
	}

	@DeleteMapping("/libelle/{libelle}")
	public int deleteByModuleLibelle(@PathVariable String libelle) {
		return moduleConcoursService.deleteByModuleLibelle(libelle);
	}

//	@PostMapping("/reference/{reference}")
//	public void save(@PathVariable String reference,@RequestBody List<ModuleConcours> modulesConcours) {
//		moduleConcoursService.save(reference, modulesConcours);
//	}

}
