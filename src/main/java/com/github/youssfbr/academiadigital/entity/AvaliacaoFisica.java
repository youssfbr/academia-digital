package com.github.youssfbr.academiadigital.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisica {

    private Long id;
    private Aluno aluno;
    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
    private Double peso;
    private Double altura;

}
