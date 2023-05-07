package com.example.be_casestudy666.controllers;

import com.example.be_casestudy666.models.Product;
import com.example.be_casestudy666.services.productService.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Product>> findAllProduct() {
        return new ResponseEntity<>(iProductService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        return new ResponseEntity<>(iProductService.findById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Product product) {
        iProductService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<?> edit(@RequestBody Product product) {
        iProductService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        iProductService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
