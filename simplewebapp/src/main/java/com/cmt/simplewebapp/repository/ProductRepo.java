package com.cmt.simplewebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cmt.simplewebapp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
