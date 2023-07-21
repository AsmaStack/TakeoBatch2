package com.takeo.assignmenttwo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.takeo.assignmenttwo.model.StudyNote;
import com.takeo.assignmenttwo.repository.StudyNoteRepository;

@RestController

@RequestMapping("/studynotes")

public class StudyNoteController {

    private final StudyNoteRepository studyNoteRepository;

    @Autowired

    public StudyNoteController(StudyNoteRepository studyNoteRepository) {

        this.studyNoteRepository = studyNoteRepository;

    }

    @PostMapping
    public StudyNote createStudyNote(@RequestBody StudyNote studyNote) {
        return studyNoteRepository.save(studyNote);
    }

    @GetMapping("/{id}")
    public StudyNote getStudyNoteById(@PathVariable Long id) {
        return studyNoteRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public StudyNote updateStudyNote(@PathVariable Long id, @RequestBody StudyNote updatedStudyNote) {
        StudyNote existingStudyNote = studyNoteRepository.findById(id).orElse(null);
        if (existingStudyNote != null) {
            existingStudyNote.setContent(updatedStudyNote.getContent());
            return studyNoteRepository.save(existingStudyNote);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteStudyNote(@PathVariable Long id) {
        studyNoteRepository.deleteById(id);
    }

}
