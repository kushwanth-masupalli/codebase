package com.example.first.controller;

import com.example.first.model.Product;
import com.example.first.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
public class ProductController {

    @Autowired
    ProductService ps ;


    @GetMapping("/products")
    public List getProdcuts(){
        return ps.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProduct(@PathVariable  int prodId){
        return ps.getProductById(prodId);
    }


    @PostMapping("/products")
    public  void  addProduct(@RequestBody Product p){
        ps.addNewProduct(p);
    }

    @PutMapping("/products")
    public void modifyProduct(@RequestBody Product p){
        ps.modifyProduct(p);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        ps.deleteProductById(prodId);
    }

}
