package com.organizacao.financa.service;

import com.organizacao.exceptions.ResultadoNaoEncontradoException;
import com.organizacao.financa.models.DespesasDiarias;

import java.util.List;

public interface DespesasDiariasService {

    DespesasDiarias salvar(DespesasDiarias despesasDiarias);

    List<DespesasDiarias> listar();
}
