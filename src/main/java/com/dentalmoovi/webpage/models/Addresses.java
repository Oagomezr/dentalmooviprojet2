package com.dentalmoovi.webpage.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "addresses")
public class Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAddress;

    @Column(nullable = false, length = 20)
    private String country;
    @Column(nullable = false, length = 20)
    private String departament;
    @Column(nullable = false, length = 20)
    private String location;
    @Column(nullable = true, length = 20)
    private String neighborhood;
    @Column(nullable = false, length = 30)
    private String address;
    @Column(nullable = false, length = 10)
    private String phoneContact;

    @ManyToMany(mappedBy = "addresses")
    private Set<Users> users = new HashSet<>();
}
