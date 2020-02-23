package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Concours;
import com.example.demo.bean.ConfigConcours;

@Repository
public interface ConfigConcoursDao extends JpaRepository<ConfigConcours, Long> {
	public List<ConfigConcours> findByConcours(Concours concours);
	public List<ConfigConcours> findByModule(Module module);

}
