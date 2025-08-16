package com.cmt.simplewebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmt.simplewebapp.model.Product;
import com.cmt.simplewebapp.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    // List<Product> products=new ArrayList<Product>(Arrays.asList(
    //         new Product(1,"Laptop",10000),
    //         new Product(2,"Mobile",5000),
    //         new Product(3,"Tablet",3000)
    // ));

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int productId) {
        return productRepo.findById(productId).orElse(null);
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepo.save(product);
    }

    public Product deleteProduct(int productId) {
        Product product = productRepo.findById(productId).orElse(null);
        productRepo.deleteById(productId);
        return product;
    }
}
