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
public class Matricula {

    private Long id;
    private Aluno aluno;
    private LocalDateTime dataDaMatricula = LocalDateTime.now();

}
