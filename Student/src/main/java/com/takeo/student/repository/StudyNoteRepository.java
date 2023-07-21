package com.takeo.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.takeo.student.model.StudyNote;
@Repository
public interface StudyNoteRepository extends JpaRepository<StudyNote, Long>{
	List<StudyNote> findAll();
}
