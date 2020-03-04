package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.ConfigConcours;


@Repository
public interface ConfigConcoursDao extends JpaRepository<ConfigConcours, Long> {
	public List<ConfigConcours> findByTypeDiplomeLibelle(String libelle);
	public List<ConfigConcours> findByConcoursReference(String reference);
	public int deleteByConcoursReference(String reference);
	public int deleteByReference(String reference);
}
