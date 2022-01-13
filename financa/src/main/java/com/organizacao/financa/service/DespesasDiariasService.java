package com.organizacao.financa.service;

import com.organizacao.financa.models.DespesasDiarias;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface DespesasDiariasService {

    DespesasDiarias salvar(DespesasDiarias despesasDiarias);

    DespesasDiarias editar(DespesasDiarias despesasDiarias);

    void deletar(Long id);

    Page<DespesasDiarias> listar(Pageable page);
}
