package com.github.youssfbr.academiadigital.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaCreate {

    private Long alunoId;
    private Double peso;
    private Double altura;

}
