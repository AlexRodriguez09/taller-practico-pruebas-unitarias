package com.conectionmysql.connectionmysql.infraestructure.adapters.output;

import com.conectionmysql.connectionmysql.application.ports.output.IProductPersistence;
import com.conectionmysql.connectionmysql.domain.model.ProductDomain;
import com.conectionmysql.connectionmysql.infraestructure.jpa.IProductRepository;
import com.conectionmysql.connectionmysql.infraestructure.jpa.ProductJPA;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductPersistenceImpl implements IProductPersistence {
    @Autowired
    private IProductRepository iProductRepository;
    @Override
    public void createProduct(ProductDomain productDomain) {
    }

    @Override
    public void updateProduct(Integer idProduct, ProductDomain productDomain) {
    }


    @Override
    public ProductJPA getProductID(Integer idProduct) {
        return null;
    }

    @Override
        public List<ProductJPA> getProducts() {

        return null;
    }


}
