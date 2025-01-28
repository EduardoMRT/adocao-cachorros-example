package br.com.eduardo.adocao_cachorros.controller;

import br.com.eduardo.adocao_cachorros.domain.Pessoa;
import br.com.eduardo.adocao_cachorros.services.PessoaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("list")
    public List<Pessoa> list(){
        return pessoaService.list();
    }

}
