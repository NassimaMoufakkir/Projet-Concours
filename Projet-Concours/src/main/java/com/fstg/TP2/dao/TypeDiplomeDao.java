package com.fstg.TP2.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.TypeDiplome;

@Repository
public interface TypeDiplomeDao extends JpaRepository<TypeDiplome, Long> {
	public TypeDiplome findByLibelle(String libelle);
	
}
