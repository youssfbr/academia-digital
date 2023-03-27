package com.github.youssfbr.academiadigital.rest.controller;

import com.github.youssfbr.academiadigital.entity.Aluno;
import com.github.youssfbr.academiadigital.rest.dto.AlunoCreate;
import com.github.youssfbr.academiadigital.service.interfaces.IAlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/alunos")
public class AlunoController {

    private final IAlunoService alunoService;

    @GetMapping
    public List<Aluno> listAllAlunos() {
        return alunoService.listAllAlunos();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoCreate alunoCreate) {
        return alunoService.createAluno(alunoCreate);
    }

}
