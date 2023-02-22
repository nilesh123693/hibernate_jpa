package com.imageupload.save.image.in.db.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Course {
    private Integer cid;
    private String courseName;

    public Course() {
    }

    public Course(Integer cid, String courseName) {
        this.cid = cid;
        this.courseName = courseName;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}

