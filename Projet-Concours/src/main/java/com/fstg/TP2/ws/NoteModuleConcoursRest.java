package com.fstg.TP2.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.bean.Module;
import com.fstg.TP2.bean.NoteModuleConcours;
import com.fstg.TP2.service.facade.NoteModuleConcoursService;

@RestController
@RequestMapping("concours-api/note-module-concours")
public class NoteModuleConcoursRest {

	@Autowired
	private NoteModuleConcoursService noteModuleConcoursService;

	@GetMapping("/")
	public List<NoteModuleConcours> findAll() {
		return noteModuleConcoursService.findAll();
	}

	@GetMapping("/inscription/etudiant/cne/{cne}")
	public NoteModuleConcours findByInscriptionEtudiantCne(String cne) {
		return noteModuleConcoursService.findByInscriptionEtudiantCne(cne);
	}

	@PostMapping("/")
	public int save(@RequestBody NoteModuleConcours noteModuleConcours) {
		return noteModuleConcoursService.save(noteModuleConcours);
	}

	@PutMapping("/note/{note}")
	public int calculNoteAvecCoef(Etudiant etudiant, Module module, Concours concours, @PathVariable double note) {
		return noteModuleConcoursService.calculNoteAvecCoef(etudiant, module, concours, note);
	}

	@GetMapping("/module/libelle/{libelle}/inscription/concours/reference/{reference}")
	public NoteModuleConcours findByModuleLibelleAndInscriptionConcoursReference(@PathVariable String libelle,
			@PathVariable String reference) {
		return noteModuleConcoursService.findByModuleLibelleAndInscriptionConcoursReference(libelle, reference);
	}

	@GetMapping("/inscription/etudiant/cne/{cne}/module/libelle/{libelle}")
	public NoteModuleConcours findByInscriptionEtudiantCneAndModuleLibelle(@PathVariable String cne,@PathVariable String libelle) {
		return noteModuleConcoursService.findByInscriptionEtudiantCneAndModuleLibelle(cne, libelle);
	}

}
