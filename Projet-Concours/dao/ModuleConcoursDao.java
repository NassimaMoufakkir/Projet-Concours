package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Concours;
import com.example.demo.bean.ModuleConcours;

@Repository
public interface ModuleConcoursDao extends JpaRepository<ModuleConcours, Long> {
	public List<ModuleConcours> findByModule(Module module);
	public List<ModuleConcours> findByConcours(Concours concours);
	

}
