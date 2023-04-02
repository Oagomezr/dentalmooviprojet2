package com.dentalmoovi.webpage.dtos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsersDTO {
    private Long idUser;
    private String firstName;
    private String lastName;
    private String email;
    private Integer celPhone;
    private LocalDate birthday;
    private String gender;
    private String password;
    private Set<AddressesDTO> addresses = new HashSet<>();
}
