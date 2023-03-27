package com.github.youssfbr.academiadigital.service.interfaces;

import com.github.youssfbr.academiadigital.entity.Aluno;
import com.github.youssfbr.academiadigital.rest.dto.AlunoCreate;
import com.github.youssfbr.academiadigital.rest.dto.AlunoUpdate;

import java.util.List;

public interface IAlunoService {

    List<Aluno> listAllAlunos();
    Aluno getAlunoById(Long alunoId);
    Aluno createAluno(AlunoCreate alunoCreate);
    Aluno updateAluno(Long alunoId, AlunoUpdate alunoUpdate);
    void deleteAlunoById(Long alunoId);

}
