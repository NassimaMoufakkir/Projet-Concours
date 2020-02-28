package com.fstg.TP2.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.Concours;
import com.fstg.TP2.bean.NoteModuleConcours;
import com.fstg.TP2.service.facade.NoteEtudiantConcoursService;

@RestController
@RequestMapping("concours/noteEtudiantConcours")
public class NoteEtudiantConcoursRest {
	@Autowired
	public NoteEtudiantConcoursService noteEtudiantConcoursService;

	@GetMapping("/cne/{cne}")
	public List<NoteModuleConcours> findByEtudiantCne(@PathVariable String cne) {
		return noteEtudiantConcoursService.findByEtudiantCne(cne);
	}

	@GetMapping("/concours/{concours}")
	public List<NoteModuleConcours> findByConcours(@RequestBody Concours concours) {
		return noteEtudiantConcoursService.findByConcours(concours);
	}

	@GetMapping("/note/{note}")
	public NoteModuleConcours findByNote(@PathVariable Double note) {
		return noteEtudiantConcoursService.findByNote(note);
	}
	
	

}
