package com.dentalmoovi.webpage.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentMethodDTO {
    private Long idPaymentMethod;
    private String nameMethod;
}
