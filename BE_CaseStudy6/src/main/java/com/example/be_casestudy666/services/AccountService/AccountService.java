package com.example.be_casestudy666.services.AccountService;

import com.example.be_casestudy666.models.Product;

import java.util.List;

public interface AccountService {
    List<Product> findAll();

    void save(Product product);

    void delete(Long id);

    Product findById(Long id);
}
