package com.example.be_casestudy666.repositories;

import com.example.be_casestudy666.models.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepo extends PagingAndSortingRepository<Product,Long> {
}
