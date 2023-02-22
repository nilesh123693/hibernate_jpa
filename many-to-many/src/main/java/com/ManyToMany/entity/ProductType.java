package com.ManyToMany.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ProductType {
    @Id
    private String productTypeId;
    private String Type;

    @ManyToMany(mappedBy = "productTypeList", cascade = CascadeType.ALL)
    List<Product> productList = new ArrayList<>();

    public ProductType() {
    }

    public ProductType(String productTypeId, String type, List<Product> productList) {
        this.productTypeId = productTypeId;
        Type = type;
        this.productList = productList;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
