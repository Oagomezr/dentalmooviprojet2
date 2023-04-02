package com.dentalmoovi.webpage.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "actions")
public class Actions {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAction;

    private String action;

    @ManyToMany(mappedBy = "actions")
    private Set<Roles> roles = new HashSet<>();
}
