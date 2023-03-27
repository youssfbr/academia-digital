package com.github.youssfbr.academiadigital.service.interfaces;

import com.github.youssfbr.academiadigital.entity.Matricula;
import com.github.youssfbr.academiadigital.rest.dto.MatriculaCreate;

import java.util.List;

public interface IMatriculaService {

    List<Matricula> listAllMatriculas();
    Matricula getMatriculaById(Long matriculaId);
    Matricula createMatricula(MatriculaCreate matriculaCreate);
    void deleteMatriculaById(Long matriculaId);

}
