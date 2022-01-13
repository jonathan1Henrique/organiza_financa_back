package com.organizacao.exceptions;

public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NotFoundException(){
        super("Não foi encontrado resultados para pesquisa");
    }

}
