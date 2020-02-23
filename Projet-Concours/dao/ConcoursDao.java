package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Concours;

@Repository
public interface ConcoursDao extends JpaRepository<Concours, Long> {
	public Concours findByReference(String reference);
	public List<Concours> findAll();
	public List<Concours> findByEtudiantCne(String cne);

}
