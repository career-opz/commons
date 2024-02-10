package dev.careeropz.commons.dto;

import lombok.Data;

@Data
public class CountryDto {
    private String code;
    private String label;
    private String phone;
    Boolean suggested;
}
