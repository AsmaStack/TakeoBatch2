package com.example.onetooneex.controller;

import com.example.onetooneex.entity.StudyNote;
import com.example.onetooneex.repository.StudyNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studynotes")
public class StudyNoteController {
    private final StudyNoteRepository studyNoteRepository;

    @Autowired
    public StudyNoteController(StudyNoteRepository studyNoteRepository) {
        this.studyNoteRepository = studyNoteRepository;
    }

    @GetMapping("/{id}")
    public StudyNote getStudyNoteById(@PathVariable Long id) {
        return studyNoteRepository.findById(id).orElse(null);
    }

    @PostMapping
    public StudyNote createStudyNote(@RequestBody StudyNote studyNote) {
        return studyNoteRepository.save(studyNote);
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
