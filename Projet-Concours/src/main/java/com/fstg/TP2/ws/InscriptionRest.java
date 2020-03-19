package com.fstg.TP2.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.bean.Inscription;
import com.fstg.TP2.service.facade.InscriptionService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
@RequestMapping("concours-api/inscription")

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

	@DeleteMapping("/reference/{reference}")
	public int deleteByReference(@PathVariable String reference) {
		return incsriptionService.deleteByReference(reference);
	}

	@DeleteMapping("/cne/{cne}")
	public int deleteByEtudiantCne(@PathVariable String cne) {
		return incsriptionService.deleteByEtudiantCne(cne);
	}

	public int save(@RequestBody Etudiant etudiant, List<Inscription> inscriptions) {
		return incsriptionService.save(etudiant, inscriptions);
	}

}
