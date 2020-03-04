package com.fstg.TP2.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.service.facade.TypeDiplomeService;

@RestController
@RequestMapping("concours-api/type-diplome")
public class TypeDiplomeRest {
	@Autowired
	private TypeDiplomeService typeDiplome;
}
