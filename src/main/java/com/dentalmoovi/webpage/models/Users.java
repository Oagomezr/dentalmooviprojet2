package com.dentalmoovi.webpage.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(nullable = false, length = 25)
    private String firstName;

    @Column(nullable = false, length = 25)
    private String lastName;

    @Column(nullable = false, unique = true, length = 60)
    private String email;

    @Column(nullable = false, unique = true, length = 10)
    private Integer celPhone;

    @Column(nullable = true)
    private LocalDate birthday;

    @Column(nullable = false, length = 15)
    private String gender;

    @Column(nullable = false, length = 30)
    private String password;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable( name = "user_addresses",
                joinColumns = { @JoinColumn(name = "id_user") },
                inverseJoinColumns = { @JoinColumn(name = "id_address") })
    private Set<Addresses> addresses = new HashSet<>();
}
