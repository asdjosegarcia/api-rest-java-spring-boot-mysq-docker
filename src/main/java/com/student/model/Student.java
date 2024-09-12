package com.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; //these imports are brining in annotations

@Entity//anotatioons 
public class Student {//class

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String DOB; // dathe of birth
    private String fatherName;
    private String motherName;

    

    public Student() {//no argument constructor
        super();// is added by java witout extra pass Even if it does not exist
    }
    

    public Student(int id, String name, String dOB, String fatherName, String motherName) {//contructor with arguments
        this.id = id;
        this.name = name;
        DOB = dOB;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public int getId() {//getter and setters
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String dOB) {
        DOB = dOB;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", DOB=" + DOB + ", fatherName=" + fatherName + ", motherName="
                + motherName + "]";
    }

}
