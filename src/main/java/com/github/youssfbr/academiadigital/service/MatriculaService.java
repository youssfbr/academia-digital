package com.github.youssfbr.academiadigital.service;

import com.github.youssfbr.academiadigital.entity.Matricula;
import com.github.youssfbr.academiadigital.rest.dto.MatriculaCreate;
import com.github.youssfbr.academiadigital.repository.IMatriculaRepository;
import com.github.youssfbr.academiadigital.service.interfaces.IMatriculaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatriculaService implements IMatriculaService {

    private final IMatriculaRepository matriculaRepository;

    @Override
    public List<Matricula> listAllMatriculas() {
        return null;
    }

    @Override
    public Matricula getMatriculaById(Long matriculaId) {
        return null;
    }

    @Override
    public Matricula createMatricula(MatriculaCreate matriculaCreate) {
        return null;
    }

    @Override
    public void deleteMatriculaById(Long matriculaId) {
    }

}
