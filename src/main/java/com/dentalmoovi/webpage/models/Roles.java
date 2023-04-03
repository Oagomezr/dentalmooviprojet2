package com.dentalmoovi.webpage.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "roles")
public class Roles {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;
    @NonNull
    private String nameRole;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable( name = "roles_permissions",
                joinColumns = { @JoinColumn(name = "id_role") },
                inverseJoinColumns = { @JoinColumn(name = "id_permission") })
    private Set<Permissions> permissions = new HashSet<>();
}
