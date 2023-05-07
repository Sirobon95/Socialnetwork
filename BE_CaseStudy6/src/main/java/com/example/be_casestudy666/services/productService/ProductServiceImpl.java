package com.example.be_casestudy666.services.productService;

import com.example.be_casestudy666.models.Product;
import com.example.be_casestudy666.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepo.findAll();
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepo.deleteById(id);
    }
    @Override
    public Product findById(Long id) {
        return productRepo.findById(id).get();
    }

}
