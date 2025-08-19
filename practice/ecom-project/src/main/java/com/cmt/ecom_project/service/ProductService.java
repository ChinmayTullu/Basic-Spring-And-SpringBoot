package com.cmt.ecom_project.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cmt.ecom_project.model.Product;
import com.cmt.ecom_project.repository.ProductRepo;

@Service
public class ProductService {
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductByid(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        if (imageFile != null && !imageFile.isEmpty()) {
            product.setImageName(imageFile.getOriginalFilename());
            product.setImageType(imageFile.getContentType());
            product.setImageData(imageFile.getBytes());
        }
        return productRepo.save(product);
    }

    public Product updatedProduct(String id, Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        
        return productRepo.save(product);
    }

    public Product deleteProduct(int id) {
        Product product=getProductByid(id);
        productRepo.deleteById(id);
        return product;
    }

    public List<Product> searchProducts(String keyword) {
        return productRepo.searchProducts(keyword);
    }
}
