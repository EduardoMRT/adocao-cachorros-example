package br.com.eduardo.adocao_cachorros.services;

import br.com.eduardo.adocao_cachorros.domain.Pessoa;
import br.com.eduardo.adocao_cachorros.exceptions.PessoaException;
import br.com.eduardo.adocao_cachorros.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public void save(Pessoa pessoa){
        pessoaRepository.save(pessoa);
    }

    public List<Pessoa> list(){
        List<Pessoa> pessoas = pessoaRepository.findAll();
        if(pessoas.isEmpty()) {
            throw new PessoaException("Não há pessoas no banco de dados");
        }
        return pessoas;
    }

}
