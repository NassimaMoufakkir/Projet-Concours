package com.fstg.TP2.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.ConfigConcours;
import com.fstg.TP2.service.facade.ConfigConcoursService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
@RequestMapping("concours-api/config-concours")
public class ConfigConcoursRest {
	@Autowired
	public ConfigConcoursService configConcoursService;

	@GetMapping("/reference/{reference}")
	public List<ConfigConcours> findByConcoursReference(@PathVariable String reference) {
		return configConcoursService.findByConcoursReference(reference);
	}

	@GetMapping("/libelle/{libelle}")
	public List<ConfigConcours> findByTypeDiplomeLibelle(@PathVariable String libelle) {
		return configConcoursService.findByTypeDiplomeLibelle(libelle);
	}

	@PostMapping("/")
	public void save(Concours concours, List<ConfigConcours> configConcours) {
		configConcoursService.save(concours, configConcours);
	}

	@GetMapping("/validate")
	public boolean validateConfigConcours(@RequestBody Concours concours, List<ConfigConcours> configConcours) {
		return configConcoursService.validateConfigConcours(concours, configConcours);
	}

	@PutMapping("/")
	public int deleteByConcoursReference(@PathVariable String reference) {
		return configConcoursService.deleteByConcoursReference(reference);
	}

}
