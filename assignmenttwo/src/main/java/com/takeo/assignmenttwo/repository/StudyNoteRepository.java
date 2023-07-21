package com.takeo.assignmenttwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.takeo.assignmenttwo.model.StudyNote;

public interface StudyNoteRepository extends JpaRepository<StudyNote, Long> {

}
