package com.organizacao.financa.controller;

import com.organizacao.financa.controller.handle.HandleValidationResource;
import com.organizacao.financa.models.DespesasDiarias;
import com.organizacao.financa.service.DespesasDiariasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/despesas-diarias")
public class DespesasDiariasController extends HandleValidationResource {

    @Autowired
    private DespesasDiariasService service;

    @GetMapping
    public ResponseEntity listar(Pageable page){
        return ResponseEntity.status(HttpStatus.OK).body(service.listar(page));
    }

    @PostMapping
    public ResponseEntity salvar(@Valid @RequestBody DespesasDiarias despesasDiarias) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(despesasDiarias));
    }

    @PutMapping
    public ResponseEntity editar(@Valid @RequestBody DespesasDiarias despesasDiarias) {
        return ResponseEntity.status(HttpStatus.OK).body(service.editar(despesasDiarias));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id){
        service.deletar(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
