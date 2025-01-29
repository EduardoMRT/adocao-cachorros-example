package br.com.eduardo.adocao_cachorros.exceptionHandlers;

import br.com.eduardo.adocao_cachorros.exceptions.CachorroException;
import br.com.eduardo.adocao_cachorros.exceptions.PessoaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CachorroExceptionHandler {

    @ExceptionHandler(CachorroException.class)
    public ResponseEntity<Object> handlePessoaException(CachorroException exception){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body("Erro: " + exception.getMessage());
    }

}
