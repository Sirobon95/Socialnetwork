package com.example.be_casestudy666.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String role;
    private boolean status;
    @OneToMany
    private List<Bill> billList;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Roles> roles;



}
