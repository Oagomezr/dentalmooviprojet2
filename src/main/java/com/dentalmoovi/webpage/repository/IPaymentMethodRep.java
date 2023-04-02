package com.dentalmoovi.webpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalmoovi.webpage.models.PaymentMethod;

public interface IPaymentMethodRep extends JpaRepository<PaymentMethod,Long>{
    
}
