package com.example.ECommerceProjectBackend.service;

import com.example.ECommerceProjectBackend.model.Product;
import com.example.ECommerceProjectBackend.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProduct() {
         return productRepo.findAll();
    }

}
