package com.fstg.TP2.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.TypeDiplome;
import com.fstg.TP2.service.facade.TypeDiplomeService;

@RestController
@RequestMapping("concours-api/type-diplome")
public class TypeDiplomeRest {
	@Autowired
	private TypeDiplomeService typeDiplomeService;

	@GetMapping("/")
	public List<TypeDiplome> findAll() {
		return typeDiplomeService.findAll();
	}

	@PostMapping("/typeDiplome/{typeDiplome}")
	public int save(TypeDiplome typeDiplome) {
		return typeDiplomeService.save(typeDiplome);
	}

	@GetMapping("/libelle/{libelle}")
	public TypeDiplome findByLibelle(String libelle) {
		return typeDiplomeService.findByLibelle(libelle);
	}

}
