package com.dentalmoovi.webpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalmoovi.webpage.models.Sections;

public interface ISectionsRep extends JpaRepository<Sections,Long>{
    
}
