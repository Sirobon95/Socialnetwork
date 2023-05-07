package com.example.be_casestudy666.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name_product;
    private Long price;
    @ManyToMany
    private List<Bill> billList;
}
