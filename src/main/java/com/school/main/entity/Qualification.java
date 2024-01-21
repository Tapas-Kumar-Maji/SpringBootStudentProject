package com.school.main.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "qualification")
public class Qualification {
    @Id
    @UuidGenerator
    private String qualificationId;

//    @JoinColumn(name = "FK_studentId", referencedColumnName = "studentId")
//    @OneToOne //(mappedBy = "qualification") //(cascade = CascadeType.ALL)
//    @MapsId
//    private Student student;
    private String secondaryGrade;
    private String secondaryBoard;
    private String higherSecondaryGrade;
    private String higherSecondaryBoard;
    private String universityStream;
    private String universityGrade;



    public String getSecondaryGrade() {
        return secondaryGrade;
    }

    public void setSecondaryGrade(String secondaryGrade) {
        this.secondaryGrade = secondaryGrade;
    }

    public String getSecondaryBoard() {
        return secondaryBoard;
    }

    public void setSecondaryBoard(String secondaryBoard) {
        this.secondaryBoard = secondaryBoard;
    }

    public String getHigherSecondaryGrade() {
        return higherSecondaryGrade;
    }

    public void setHigherSecondaryGrade(String higherSecondaryGrade) {
        this.higherSecondaryGrade = higherSecondaryGrade;
    }

    public String getHigherSecondaryBoard() {
        return higherSecondaryBoard;
    }

    public void setHigherSecondaryBoard(String higherSecondaryBoard) {
        this.higherSecondaryBoard = higherSecondaryBoard;
    }

    public String getUniversityStream() {
        return universityStream;
    }

    public void setUniversityStream(String universityStream) {
        this.universityStream = universityStream;
    }

    public String getUniversityGrade() {
        return universityGrade;
    }

    public void setUniversityGrade(String universityGrade) {
        this.universityGrade = universityGrade;
    }
}
