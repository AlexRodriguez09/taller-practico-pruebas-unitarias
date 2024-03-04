package com.conectionmysql.connectionmysql.application.service;

import com.conectionmysql.connectionmysql.application.ports.input.IProductPort;
import com.conectionmysql.connectionmysql.application.ports.output.IProductPersistence;
import com.conectionmysql.connectionmysql.domain.model.ProductDomain;
import com.conectionmysql.connectionmysql.infraestructure.jpa.ProductJPA;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductPortImpl implements IProductPort {

    private final IProductPersistence iProductPersistence;

    public ProductPortImpl(IProductPersistence iProductPersistence) {
        this.iProductPersistence = iProductPersistence;
    }

    @Override
    public void createProduct(String nameProduct, String typeProduct, String categoryProduct) {
    }

    @Override
    public void updateProduct(Integer idProduct, String nameProduct, String typeProduct,String categoryProduct) {

    }

    private ProductJPA existProduct(Integer idProduct){
        return iProductPersistence.getProductID(idProduct);
    }
}
