package br.com.eduardo.adocao_cachorros.controller;

import br.com.eduardo.adocao_cachorros.domain.Cachorro;
import br.com.eduardo.adocao_cachorros.domain.Doador;
import br.com.eduardo.adocao_cachorros.services.CachorroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cachorro")
public class CachorroController {

    private final CachorroService cachorroService;

    public CachorroController(CachorroService cachorroService) {
        this.cachorroService = cachorroService;
    }

    @GetMapping("list")
    public List<Cachorro> list(){
        return cachorroService.list();
    }

    @GetMapping("buscaDoadorPorCachorro/{idCachorro}")
    public Doador buscaDoadorPorCachorro(@PathVariable("idCachorro") int idCachorro){
        return cachorroService
                .buscaDoadorPorCachorro(
                        buscaCachorroPorId(idCachorro)
                );
    }

    @GetMapping("buscaCachorroPorId/{id}")
    public Cachorro buscaCachorroPorId(@PathVariable("id") int id){
        return cachorroService
                .buscaCachorroPorId(id);
    }

}
