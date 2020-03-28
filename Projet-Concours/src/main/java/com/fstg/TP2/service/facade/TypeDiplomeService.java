package com.fstg.TP2.service.facade;

import java.util.List;
import com.fstg.TP2.bean.TypeDiplome;

public interface TypeDiplomeService {
	
	public List<TypeDiplome> findAll();
	public int save(TypeDiplome typeDiplome);
	public TypeDiplome findByLibelle(String libelle);

}
