package com.dentalmoovi.webpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalmoovi.webpage.models.Addresses;

public interface IAddressesRep extends JpaRepository<Addresses,Long>{
    
}
