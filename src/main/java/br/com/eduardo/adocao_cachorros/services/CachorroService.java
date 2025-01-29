package br.com.eduardo.adocao_cachorros.services;

import br.com.eduardo.adocao_cachorros.domain.Cachorro;
import br.com.eduardo.adocao_cachorros.domain.Doador;
import br.com.eduardo.adocao_cachorros.exceptions.CachorroException;
import br.com.eduardo.adocao_cachorros.repository.CachorroRepository;
import br.com.eduardo.adocao_cachorros.repository.DoadorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CachorroService {

    private final CachorroRepository cachorroRepository;
    private final DoadorRepository doadorRepository;
    public CachorroService(CachorroRepository cachorroRepository, DoadorRepository doadorRepository) {
        this.cachorroRepository = cachorroRepository;
        this.doadorRepository = doadorRepository;
    }

    public List<Cachorro> list(){
        List<Cachorro> cachorros = cachorroRepository.findAll();
        if(cachorros.isEmpty()){
            throw new CachorroException("A lista de cachorros está vazia", NivelExceptionEnum.INFO);
        }
        return cachorros;
    }

    public Doador buscaDoadorPorCachorro(Cachorro cachorro){
        return doadorRepository
                .findById(cachorro.getDoador().getId())
                .orElseThrow(() -> new CachorroException("Ocorreu uma falha ao tentar buscar doador por cachorro", NivelExceptionEnum.ERRO));
    }

    public List<Cachorro> buscaCachorroPorNome(String nome){
        return cachorroRepository
                .findByNomeContaining(nome);
    }

    public List<Cachorro> buscaCachorroPorIdade(int idade){
        return cachorroRepository
                .findByIdade(idade);
    }

    public Cachorro buscaCachorroPorId(int id){
        return cachorroRepository
                .findById(Long.valueOf(String.valueOf(id)))
                .orElseThrow(() -> new CachorroException("Ocorreu uma falha ao tentar buscar o cachorro por id", NivelExceptionEnum.ERRO));
    }

    @Transactional
    public void save(Cachorro cachorro){
        cachorroRepository.save(cachorro);
    }


}
