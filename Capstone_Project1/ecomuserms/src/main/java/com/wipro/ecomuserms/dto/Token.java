package com.wipro.ecomuserms.dto;

import lombok.AllArgsConstructor;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Token {
    private String token;
    private String message;
}