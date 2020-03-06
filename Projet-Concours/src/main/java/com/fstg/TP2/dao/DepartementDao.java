package com.fstg.TP2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.Departement;

@Repository
public interface DepartementDao extends JpaRepository<Departement, Long> {
	public Departement findByRefrence(String reference);
	public int deleteByRefrence(String reference);

}
