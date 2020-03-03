package com.fstg.TP2.ws;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.Filiere;
import com.fstg.TP2.service.facade.FiliereService;

@RestController
@RequestMapping("concours/Filiere")
public class FiliereRest {
    private FiliereService filiereService;
    
    @GetMapping("/libelle/{libelle}")
    public Filiere findByLibelle(String libelle) {
        return filiereService.findByLibelle(libelle);
    }

    @GetMapping("/")
    public List<Filiere> findAll() {
        return filiereService.findAll();
    }
    
     @PostMapping("/")
    public int save(@RequestBody Filiere filiere) {
        return filiereService.save(filiere);
    }
    
}
