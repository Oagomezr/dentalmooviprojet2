package com.dentalmoovi.webpage.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column(nullable = false, length = 70)
    private String nameProduct;

    @Column(nullable = false)
    private double unitPrice;

    @Column(nullable = true)
    private String description;

    @Column(nullable = true)
    private LocalDate expirationDate;

    @Column(nullable = true, length = 30)
    private String invima;

    @Column(nullable = false, length = 30)
    private String lote;

    @Column(nullable = false, length = 50)
    private Integer stock;
}
