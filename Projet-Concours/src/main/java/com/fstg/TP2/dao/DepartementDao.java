package com.fstg.TP2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.TP2.bean.Departement;

@Repository
public interface DepartementDao extends JpaRepository<Departement, Long> {

    Departement findByReference(String reference);
}
