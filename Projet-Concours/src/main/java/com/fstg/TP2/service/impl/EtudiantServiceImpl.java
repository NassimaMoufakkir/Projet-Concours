package com.fstg.TP2.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.TP2.bean.Etudiant;
import com.fstg.TP2.dao.EtudiantDao;
import com.fstg.TP2.service.facade.EtudiantService;
import com.fstg.TP2.service.facade.InscriptionService;

@Service
public class EtudiantServiceImpl implements EtudiantService {
	@Autowired
	public EtudiantDao etudiantDao;
	@Autowired
	public InscriptionService inscriptionService;

	@Override
	public Etudiant findByCne(String cne) {
		return etudiantDao.findByCne(cne);
	}

	@Override
	public List<Etudiant> findAll() {
		return etudiantDao.findAll();
	}

	@Override
	@Transactional
	public int deleteByCne(String cne) {
		int resInscription = inscriptionService.deleteByEtudiantCne(cne);
		int resEtudiant = etudiantDao.deleteByCne(cne);
		return resInscription * resEtudiant;
	}

	@Override
	public int save(Etudiant etudiant) {

		Etudiant foundedEtudiant = findByCne(etudiant.getCne());
		if (foundedEtudiant != null) {
			return -1;

		} else {
			etudiantDao.save(etudiant);
			inscriptionService.save(etudiant, etudiant.getInscriptions());
			return 1;
		}

	}

}
