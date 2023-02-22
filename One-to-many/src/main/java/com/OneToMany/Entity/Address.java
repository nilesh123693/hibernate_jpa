package com.OneToMany.Entity;


import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    private int addId;

    private String city;

    private String state;

    private String country;

    @ManyToOne
    private Student1 student1;

    public Address() {

    }

    public Address(int addId, String city, String state, String country, Student1 student1) {
        this.addId = addId;
        this.city = city;
        this.state = state;
        this.country = country;
        this.student1 = student1;
    }

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student1 getStudent1() {
        return student1;
    }

    public void setStudent1(Student1 student1) {
        this.student1 = student1;
    }
}
