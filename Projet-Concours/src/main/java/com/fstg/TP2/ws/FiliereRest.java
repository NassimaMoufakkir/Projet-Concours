package com.fstg.TP2.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.Departement;
import com.fstg.TP2.bean.Filiere;
import com.fstg.TP2.service.facade.FiliereService;

@RestController
@RequestMapping("concours/Filiere")
public class FiliereRest {
	@Autowired
    private FiliereService filiereService;

	@GetMapping("/libelle/{libelle}")
	public Filiere findByLibelle(String reference) {
		return filiereService.findByLibelle(reference);
	}

	@DeleteMapping("/departement/reference/{reference}")
	public List<Filiere> findByDepartementRefrence(String reference) {
		return filiereService.findByDepartementRefrence(reference);
	}

	public int deleteByDepartementReference(String reference) {
		return filiereService.deleteByDepartementReference(reference);
	}

	public int deleteByLibelle(String libelle) {
		return filiereService.deleteByLibelle(libelle);
	}

	@GetMapping("/")
	public List<Filiere> findAll() {
		return filiereService.findAll();
	}

	public int save(Departement departement, List<Filiere> filieres) {
		return filiereService.save(departement, filieres);
	}
    
    
}
