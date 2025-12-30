package com.example.first.service;


import com.example.first.model.Product;
import com.example.first.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Component
@Service
public class ProductService {

    @Autowired
    ProductRepository pr;

    public ProductService() {

    }

    public List<Product> getProducts() {
       return pr.findAll();
    }

    public Product getProductById(int prodId) {
        return pr.findById(prodId)
                .orElse(null);
    }


    public void addNewProduct(Product p) {
        pr.save(p);
    }

    public void modifyProduct(Product product) {
        pr.save(product);
    }

    public void deleteProductById(int prodId) {
        pr.deleteById(prodId);
    }
}
