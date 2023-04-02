package com.dentalmoovi.webpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalmoovi.webpage.models.Cart;

public interface ICartRep extends JpaRepository<Cart,Long>{
    
}
