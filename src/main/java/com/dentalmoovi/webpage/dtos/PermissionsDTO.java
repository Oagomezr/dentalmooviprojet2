package com.dentalmoovi.webpage.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PermissionsDTO {
    private Long idAction;
    private String action;
}
