package com.github.youssfbr.academiadigital.repository;

import com.github.youssfbr.academiadigital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlunoRepository extends JpaRepository<Aluno, Long> {
}
