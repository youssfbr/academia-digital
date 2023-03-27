package com.github.youssfbr.academiadigital.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlunoUpdate {

    private String nome;
    private String bairro;
    private LocalDate dataDeNascimento;

}
