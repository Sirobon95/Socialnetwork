package com.example.be_casestudy666.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_category;
    private String name_category;
    @OneToMany
    List<Product> productList;
}
