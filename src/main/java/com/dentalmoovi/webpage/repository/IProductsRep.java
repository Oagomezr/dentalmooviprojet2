package com.dentalmoovi.webpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalmoovi.webpage.models.Products;

public interface IProductsRep extends JpaRepository<Products,Long>{
    
}
