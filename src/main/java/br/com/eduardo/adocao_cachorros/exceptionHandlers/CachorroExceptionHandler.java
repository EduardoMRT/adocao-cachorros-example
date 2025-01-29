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
        HttpStatus status;

        switch (exception.getNivel()) {
            case ERRO:
                status = HttpStatus.BAD_REQUEST; // 400
                break;
            case ALERTA:
                status = HttpStatus.FORBIDDEN; // 403
                break;
            case INFO:
                status = HttpStatus.OK; // 200
                break;
            default:
                status = HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return ResponseEntity
                .status(status)
                .body(exception.getNivel().getDescricao() + ": " + exception.getMessage());
    }

}
