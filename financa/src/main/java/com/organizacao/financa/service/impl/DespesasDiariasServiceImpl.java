package com.organizacao.financa.service.impl;

import com.organizacao.financa.models.DespesasDiarias;
import com.organizacao.financa.repository.DespesasDiariasRepository;
import com.organizacao.financa.service.DespesasDiariasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesasDiariasServiceImpl implements DespesasDiariasService {

    @Autowired
    private DespesasDiariasRepository repository;

    public DespesasDiarias salvar(DespesasDiarias despesasDiarias) {
        return repository.save(despesasDiarias);
    }


    public List<DespesasDiarias> listar() {
        return repository.findAll();

    }
}
