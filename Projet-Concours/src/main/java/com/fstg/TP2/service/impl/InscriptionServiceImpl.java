
package com.fstg.TP2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.bean.Inscription;
import com.fstg.TP2.dao.InscriptionDao;
import com.fstg.TP2.service.facade.EtudiantService;
import com.fstg.TP2.service.facade.InscriptionService;

@Service
public class InscriptionServiceImpl implements InscriptionService {

	@Autowired
	public InscriptionDao inscriptionDao;

	@Autowired
	public EtudiantService etudiantService;

	@Override
	public Inscription findByReference(String reference) {
		return inscriptionDao.findByReference(reference);
	}

	@Override
	public List<Inscription> findAll() {
		return inscriptionDao.findAll();
	}

	@Override
	public List<Inscription> findByEtudiantCne(String cne) {
		return inscriptionDao.findByEtudiantCne(cne);
	}

	@Override
	public List<Inscription> findByEtudiantCneConcoursReference(String cne, String reference) {
		return inscriptionDao.findByEtudiantCneAndConcoursReference(cne, reference);
	}

	@Override
	public int save(Inscription inscription) {

		Inscription foundedInscription = findByReference(inscription.getReference());

		Etudiant etudiant = etudiantService.findByCne(inscription.getEtudiant().getCne());
		if (foundedInscription != null) {
			return -1;
		} else if (etudiant != null) {
			return -2;
		} else {
			inscriptionDao.save(inscription);
			return 1;
		}

	}

	@Override
	public int deleteByReference(String reference) {
		// TODO Auto-generated method stub
		return 0;
	}

}
