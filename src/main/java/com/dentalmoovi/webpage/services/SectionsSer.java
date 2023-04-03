package com.dentalmoovi.webpage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dentalmoovi.webpage.repository.ISectionsRep;

@Service
public class SectionsSer {
    
    @Autowired
    private ISectionsRep sectionsRep;

    
}
