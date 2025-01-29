package br.com.eduardo.adocao_cachorros.exceptions;

import br.com.eduardo.adocao_cachorros.services.NivelExceptionEnum;

public class CachorroException extends RuntimeException{

    private NivelExceptionEnum nivel;
    public CachorroException(String message, NivelExceptionEnum nivelExceptionEnum){
        super(message);
        this.nivel = nivelExceptionEnum;
    }
    public NivelExceptionEnum getNivel() {
        return nivel;
    }
}
