package com.example.onetooneex.entity;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // student_id

    private String name;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudyNote studyNote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudyNote getStudyNote() {
        return studyNote;
    }

    public void setStudyNote(StudyNote studyNote) {
        this.studyNote = studyNote;
    }
}
