package com.organizacao.exceptions;

import lombok.Getter;

public class ResultadoNaoEncontradoException extends Exception {

    @Getter
    private String mensagem;

    public ResultadoNaoEncontradoException(){
        this.mensagem = "Resultados não encontrados";
    }
}
