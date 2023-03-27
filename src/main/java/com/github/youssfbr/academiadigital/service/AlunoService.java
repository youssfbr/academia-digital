package com.github.youssfbr.academiadigital.service;

import com.github.youssfbr.academiadigital.entity.Aluno;
import com.github.youssfbr.academiadigital.rest.dto.AlunoCreate;
import com.github.youssfbr.academiadigital.rest.dto.AlunoUpdate;
import com.github.youssfbr.academiadigital.repository.IAlunoRepository;
import com.github.youssfbr.academiadigital.service.interfaces.IAlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService implements IAlunoService {

    private final IAlunoRepository alunoRepository;

    @Override
    public List<Aluno> listAllAlunos() {
        return null;
    }

    @Override
    public Aluno getAlunoById(Long alunoId) {
        return null;
    }

    @Override
    public Aluno createAluno(AlunoCreate alunoCreate) {
        return null;
    }

    @Override
    public Aluno updateAluno(Long alunoId, AlunoUpdate alunoUpdate) {
        return null;
    }

    @Override
    public void deleteAlunoById(Long alunoId) {
    }

}
