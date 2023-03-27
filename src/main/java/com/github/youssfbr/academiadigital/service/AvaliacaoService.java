package com.github.youssfbr.academiadigital.service;

import com.github.youssfbr.academiadigital.entity.AvaliacaoFisica;
import com.github.youssfbr.academiadigital.rest.dto.AvaliacaoFisicaCreate;
import com.github.youssfbr.academiadigital.rest.dto.AvaliacaoFisicaUpdate;
import com.github.youssfbr.academiadigital.repository.IAvaliacaoFisicaRepository;
import com.github.youssfbr.academiadigital.service.interfaces.IAvaliacaoFisicaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliacaoService implements IAvaliacaoFisicaService {

    private final IAvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Override
    public List<AvaliacaoFisica> listAllAvaliacoesFisicas() {
        return null;
    }

    @Override
    public AvaliacaoFisica getAvaliacaoFisicaById(Long avaliacaoFisicaId) {
        return null;
    }

    @Override
    public AvaliacaoFisica createAvaliacaoFisica(AvaliacaoFisicaCreate avaliacaoFisicaCreate) {
        return null;
    }

    @Override
    public AvaliacaoFisica updateAvaliacaoFisica(Long avaliacaoFisicaId, AvaliacaoFisicaUpdate avaliacaoFisicaUpdate) {
        return null;
    }

    @Override
    public void deleteAvaliacaoFisicaById(Long avaliacaoFisicaId) {
    }

}
