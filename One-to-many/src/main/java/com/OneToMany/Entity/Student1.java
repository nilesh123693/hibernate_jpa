package com.OneToMany.Entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student1 {
    @Id
    private int id;
    private String studentName;
    private String about;


    @OneToMany(mappedBy = "student1", cascade = CascadeType.ALL)
    List<Address> list = new ArrayList<>();

    public Student1() {

    }

    public Student1(int id, String studentName, String about, List<Address> list) {
        this.id = id;
        this.studentName = studentName;
        this.about = about;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Address> getList() {
        return list;
    }

    public void setList(List<Address> list) {
        this.list = list;
    }
}
