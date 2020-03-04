package com.fstg.TP2.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.service.facade.NoteModuleConcoursService;

@RestController
@RequestMapping("concours-api/note-module-concours")
public class NoteModuleConcoursRest {
	@Autowired
	private NoteModuleConcoursService noteModuleConcoursService;
}
