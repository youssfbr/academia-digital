package com.github.youssfbr.academiadigital.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    private Long id;
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataDeNascimento;
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();



}
