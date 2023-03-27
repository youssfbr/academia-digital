package com.github.youssfbr.academiadigital.service;

import com.github.youssfbr.academiadigital.entity.Aluno;
import com.github.youssfbr.academiadigital.rest.dto.AlunoCreate;
import com.github.youssfbr.academiadigital.rest.dto.AlunoUpdate;
import com.github.youssfbr.academiadigital.repository.IAlunoRepository;
import com.github.youssfbr.academiadigital.service.interfaces.IAlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService implements IAlunoService {

    private final IAlunoRepository alunoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Aluno> listAllAlunos() {
        return alunoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Aluno getAlunoById(Long alunoId) {
        return null;
    }

    @Override
    @Transactional
    public Aluno createAluno(AlunoCreate alunoCreate) {
        
        Aluno aluno = new Aluno();
        aluno.setNome(alunoCreate.getNome());
        aluno.setCpf(alunoCreate.getCpf());
        aluno.setBairro(alunoCreate.getBairro());
        aluno.setDataDeNascimento(alunoCreate.getDataDeNascimento());

        return alunoRepository.save(aluno);
    }

    @Override
    @Transactional
    public Aluno updateAluno(Long alunoId, AlunoUpdate alunoUpdate) {
        return null;
    }

    @Override
    public void deleteAlunoById(Long alunoId) {
    }

}
