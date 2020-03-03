package com.fstg.TP2.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.TP2.bean.Departement;
import com.fstg.TP2.service.facade.DepartementService;

/**
 *
 * @author HPi7
 */
@RestController
@RequestMapping("project-jee/Departement")
public class DepartementRest {
    @Autowired
    private DepartementService departementService ;
    
    @GetMapping ("/reference/{reference}")
    public Departement findByReference(String reference) {
        return departementService.findByReference(reference);
    }
    
    @GetMapping("/")
    public List<Departement> findAll() {
        return departementService.findAll();
    }
    
     @PostMapping("/")
    public int save(@RequestBody Departement departement) {
        return departementService.save(departement);
    }
    
}
