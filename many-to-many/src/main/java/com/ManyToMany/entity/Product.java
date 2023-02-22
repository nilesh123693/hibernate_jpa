package com.ManyToMany.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    private String pid;
    private String name;

    @ManyToMany
    List<ProductType> productTypeList = new ArrayList<>();

    public Product() {

    }

    public Product(String pid, String name, List<ProductType> productTypeList) {
        this.pid = pid;
        this.name = name;
        this.productTypeList = productTypeList;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductType> getProductTypeList() {
        return productTypeList;
    }

    public void setProductTypeList(List<ProductType> productTypeList) {
        this.productTypeList = productTypeList;
    }
}
