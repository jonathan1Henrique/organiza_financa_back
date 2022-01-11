package com.organizacao.financa.controller;

import com.organizacao.financa.controller.validacao.ValidacaoController;
import com.organizacao.financa.models.DespesasDiarias;
import com.organizacao.financa.service.DespesasDiariasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/despesas-diarias")
public class DespesasDiariasController extends ValidacaoController {

    @Autowired
    private DespesasDiariasService service;

    @GetMapping
    public ResponseEntity listar() {
        return ResponseEntity.status(HttpStatus.OK).body(service.listar());

    }

    @PostMapping
    public ResponseEntity salvar(@Valid @RequestBody DespesasDiarias despesasDiarias) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(despesasDiarias));
    }


}
