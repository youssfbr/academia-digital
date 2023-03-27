package com.github.youssfbr.academiadigital.service.interfaces;

import com.github.youssfbr.academiadigital.entity.AvaliacaoFisica;
import com.github.youssfbr.academiadigital.rest.dto.AvaliacaoFisicaCreate;
import com.github.youssfbr.academiadigital.rest.dto.AvaliacaoFisicaUpdate;

import java.util.List;

public interface IAvaliacaoFisicaService {

    List<AvaliacaoFisica> listAllAvaliacoesFisicas();
    AvaliacaoFisica getAvaliacaoFisicaById(Long avaliacaoFisicaId);
    AvaliacaoFisica createAvaliacaoFisica(AvaliacaoFisicaCreate avaliacaoFisicaCreate);
    AvaliacaoFisica updateAvaliacaoFisica(Long avaliacaoFisicaId, AvaliacaoFisicaUpdate avaliacaoFisicaUpdate);
    void deleteAvaliacaoFisicaById(Long avaliacaoFisicaId);

}
