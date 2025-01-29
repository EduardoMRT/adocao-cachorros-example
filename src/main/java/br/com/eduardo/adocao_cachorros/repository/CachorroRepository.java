package br.com.eduardo.adocao_cachorros.repository;

import br.com.eduardo.adocao_cachorros.domain.Cachorro;
import br.com.eduardo.adocao_cachorros.domain.Doador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CachorroRepository extends JpaRepository<Cachorro, Long> {
    List<Cachorro> findByDoador(Doador doador);
    List<Cachorro> findByNomeContaining(String nome);
    List<Cachorro> findByIdade(int age);
}
