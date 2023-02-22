package com.springjpa.Entity;


import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    private int id;
    private String studentName;
    private String about;

    @OneToOne(mappedBy = "student" ,cascade = CascadeType.ALL)
    private Laptop laptop;

    public Student() {

    }

    public Student(int id, String studentName, String about, Laptop laptop) {
        this.id = id;
        this.studentName = studentName;
        this.about = about;
        this.laptop = laptop;
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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

}
