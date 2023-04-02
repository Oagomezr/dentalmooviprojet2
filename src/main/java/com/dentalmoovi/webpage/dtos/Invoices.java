package com.dentalmoovi.webpage.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Invoices {
    private Long idInvoice;
    private Integer quantity;
    private double amount;
    private OrdersDTO idOrder;
    private ProductsDTO idProduct;
}
