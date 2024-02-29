package com.conectionmysql.connectionmysql.application.ports.output;

import com.conectionmysql.connectionmysql.domain.model.ProductDomain;
import com.conectionmysql.connectionmysql.infraestructure.jpa.ProductJPA;

import java.util.List;

public interface IProductPersistence {

    void createProduct(ProductDomain productDomain);


    ProductJPA getProductID(Integer idProduct);

    List<ProductJPA> getProducts();

    void updateProduct(Integer idProduct, ProductDomain productDomain);
}
