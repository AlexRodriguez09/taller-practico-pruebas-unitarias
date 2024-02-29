package com.conectionmysql.connectionmysql.application.ports.input;

import com.conectionmysql.connectionmysql.infraestructure.jpa.ProductJPA;

public interface IProductPort {

    void createProduct(String nameProduct, String typeProduct, String categoryProduct);
    void updateProduct(Integer idProduct, String nameProduct, String typeProduct, String categoryProduct);
}
