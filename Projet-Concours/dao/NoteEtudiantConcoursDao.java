package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Concours;
import com.example.demo.bean.NoteEtudiantConcours;

@Repository
public interface NoteEtudiantConcoursDao extends JpaRepository<NoteEtudiantConcours, Long> {
	public List<NoteEtudiantConcours> findByEtudiantCne(String cne);
	public List<NoteEtudiantConcours> findByConcours(Concours concours);
	public NoteEtudiantConcours findByNote(Double note);

}
