package com.dentalmoovi.webpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalmoovi.webpage.models.Users;

public interface IUserRep extends JpaRepository<Users,Long>{
    
}
