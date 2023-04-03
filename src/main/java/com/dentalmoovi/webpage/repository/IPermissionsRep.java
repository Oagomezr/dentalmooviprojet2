package com.dentalmoovi.webpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalmoovi.webpage.models.Permissions;

public interface IPermissionsRep extends JpaRepository<Permissions,Long>{
    
}
