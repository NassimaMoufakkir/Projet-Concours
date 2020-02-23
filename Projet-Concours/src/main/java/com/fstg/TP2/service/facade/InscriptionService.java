package com.fstg.TP2.service.facade;

import java.util.List;

import com.fstg.TP2.bean.Inscription;

public interface InscriptionService {
	public Inscription findByReference(String reference);

	public List<Inscription> findAll();

}
