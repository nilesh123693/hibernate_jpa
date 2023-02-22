package com.imageupload.save.image.in.db.entity;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;

    @Column(name = "NAME")
    private String name;
    private String city;

    @Transient
    private Integer age;

    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date date;

    public Student(Integer sid, String name, String city, Integer age, Date date, Course course) {
        this.sid = sid;
        this.name = name;
        this.city = city;
        this.age = age;
        this.date = date;
        this.course = course;
    }

    private Course  course;


    public Student() {

    }



    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
