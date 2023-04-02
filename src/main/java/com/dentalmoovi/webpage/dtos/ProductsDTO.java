package com.dentalmoovi.webpage.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductsDTO {
    private Long idProduct;
    private String nameProduct;
    private double unitPrice;
    private String description;
    private LocalDate expirationDate;
    private String invima;
    private String lote;
    private Integer stock;
}
