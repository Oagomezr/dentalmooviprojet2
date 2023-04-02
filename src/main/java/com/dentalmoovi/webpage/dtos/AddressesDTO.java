package com.dentalmoovi.webpage.dtos;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressesDTO {
    private Long idAddress;
    private String country;
    private String departament;
    private String location;
    private String neighborhood;
    private String address;
    private String phoneContact;
    private Set<UsersDTO> users = new HashSet<>();
}
