package com.dentalmoovi.webpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalmoovi.webpage.models.Roles;

public interface IRolesRep extends JpaRepository<Roles,Long>{
    
}
