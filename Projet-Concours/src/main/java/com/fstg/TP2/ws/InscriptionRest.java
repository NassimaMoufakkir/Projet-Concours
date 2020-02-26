package com.fstg.TP2.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.Inscription;
import com.fstg.TP2.service.facade.InscriptionService;

@RestController
@RequestMapping("concours/inscription")

public class InscriptionRest {

	@Autowired
	public InscriptionService incsriptionService;

	@GetMapping("/reference/{reference}")
	public Inscription findByReference(@PathVariable String reference) {
		return incsriptionService.findByReference(reference);
	}

	@GetMapping("/")
	public List<Inscription> findAll() {
		return incsriptionService.findAll();
	}

	@GetMapping("/cne/{cne}")
	public List<Inscription> findByEtudiantCne(@PathVariable String cne) {
		return incsriptionService.findByEtudiantCne(cne);
	}

	@GetMapping("/cne/{cne}/reference/{reference}")
	public List<Inscription> findByEtudiantCneConcoursReference(@PathVariable String cne,
			@PathVariable String reference) {
		return incsriptionService.findByEtudiantCneConcoursReference(cne, reference);
	}

	@PostMapping("/")
	public int save(@RequestBody Inscription inscription) {
		return incsriptionService.save(inscription);
	}

}
