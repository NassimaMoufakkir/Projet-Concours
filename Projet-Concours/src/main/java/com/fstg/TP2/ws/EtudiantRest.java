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

import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.service.facade.EtudiantService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
@RequestMapping("concours-api/etudiant")
public class EtudiantRest {
	@Autowired
	public EtudiantService etudiantService;

	@GetMapping("/cne/{cne}")
	public Etudiant findByCne(@PathVariable String cne) {
		return etudiantService.findByCne(cne);
	}

	@GetMapping("/")
	public List<Etudiant> findAll() {
		return etudiantService.findAll();
	}

	@PostMapping("/")
	public int save(@RequestBody Etudiant etudiant) {
		return etudiantService.save(etudiant);
	}

	@DeleteMapping("/cne/{cne}")
	public int deleteByCne(@PathVariable String cne) {
		return etudiantService.deleteByCne(cne);
	}
	

}
