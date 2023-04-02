package com.dentalmoovi.webpage.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "sections")
public class Sections {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSection;

    @Column(nullable = false, length = 20)
    private String nameSetion;
}
