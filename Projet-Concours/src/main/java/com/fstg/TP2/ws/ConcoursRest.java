package com.fstg.TP2.ws;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.service.facade.ConcoursService;

@RestController
@RequestMapping("concours-api/concours")
public class ConcoursRest {
	@Autowired
	public ConcoursService concoursService;

	@GetMapping("/reference/{reference}")
	public Concours findByReference(@PathVariable String reference) {
		return concoursService.findByReference(reference);
	}

	@GetMapping("/")
	public List<Concours> findAll() {
		return concoursService.findAll();
	}

	@GetMapping("/cne/{cne}")
	public List<Concours> findByEtudiantCne(@PathVariable String cne) {
		return concoursService.findByEtudiantCne(cne);
	}

	@GetMapping("/anneeConcours/{anneeConcours}")
	public List<Concours> findByAnneeConcours(@PathVariable int anneeConcours) {
		return concoursService.findByAnneeConcours(anneeConcours);
	}

	@PostMapping("/")
	public int save(@RequestBody Concours concours) {
		return concoursService.save(concours);
	}
	
	

}
