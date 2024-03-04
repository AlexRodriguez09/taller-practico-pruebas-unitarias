package com.conectionmysql.connectionmysql.domain.model;


import com.conectionmysql.connectionmysql.domain.exceptions.ProductException;

public class ProductDomain {

    private String nameProduct;
    private String nameCompany;

    private String typeProduct;

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }
}
