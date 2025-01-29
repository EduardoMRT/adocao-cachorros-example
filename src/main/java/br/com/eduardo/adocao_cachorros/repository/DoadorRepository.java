package br.com.eduardo.adocao_cachorros.repository;

import br.com.eduardo.adocao_cachorros.domain.Doador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoadorRepository extends JpaRepository<Doador, Long> {
}
