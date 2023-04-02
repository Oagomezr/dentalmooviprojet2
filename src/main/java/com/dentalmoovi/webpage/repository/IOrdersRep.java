package com.dentalmoovi.webpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalmoovi.webpage.models.Orders;

public interface IOrdersRep extends JpaRepository<Orders,Long>{
    
}
