
package com.fstg.TP2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.bean.Inscription;
import com.fstg.TP2.dao.InscriptionDao;
import com.fstg.TP2.service.facade.ConcoursService;
import com.fstg.TP2.service.facade.EtudiantService;
import com.fstg.TP2.service.facade.InscriptionService;

@Service
public class InscriptionServiceImpl implements InscriptionService {

	@Autowired
	public InscriptionDao inscriptionDao;

	@Autowired
	public EtudiantService etudiantService;

	@Autowired
	public ConcoursService concoursService;

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
	public int deleteByReference(String reference) {
		return inscriptionDao.deleteByReference(reference);
	}

	@Override
	public int deleteByEtudiantCne(String cne) {
		return inscriptionDao.deleteByEtudiantCne(cne);
	}

	@Override
	public int save(Etudiant etudiant, List<Inscription> inscriptions) {
		for (Inscription inscription : inscriptions) {
			inscription.setEtudiant(etudiant);
			inscriptionDao.save(inscription);

		}

		return 1;
	}

}
