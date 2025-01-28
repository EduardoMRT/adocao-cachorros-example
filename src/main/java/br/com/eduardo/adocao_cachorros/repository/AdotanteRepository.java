package br.com.eduardo.adocao_cachorros.repository;

import br.com.eduardo.adocao_cachorros.domain.Adotante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdotanteRepository extends JpaRepository<Adotante, Long> {
}
