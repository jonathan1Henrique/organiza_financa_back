package com.organizacao.financa.service.impl;

import com.organizacao.exceptions.NotFoundException;
import com.organizacao.financa.models.DespesasDiarias;
import com.organizacao.financa.repository.DespesasDiariasRepository;
import com.organizacao.financa.service.DespesasDiariasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DespesasDiariasServiceImpl implements DespesasDiariasService {

    @Autowired
    private DespesasDiariasRepository repository;

    @Override
    public DespesasDiarias salvar(DespesasDiarias despesasDiarias) {
        return repository.save(despesasDiarias);
    }

    @Override
    public void deletar(Long id){
        repository.deleteById(id);
    }

    @Override
    public DespesasDiarias editar(DespesasDiarias despesasDiarias) {
        return repository.save(despesasDiarias);
    }

    @Override
    public Page<DespesasDiarias> listar(Pageable page) {

        Page<DespesasDiarias> despesas = repository.findAll(page);

        if(despesas.isEmpty())
            throw new NotFoundException();

        return despesas;
    }
}
