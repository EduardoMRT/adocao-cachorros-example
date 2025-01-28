package br.com.eduardo.adocao_cachorros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CachorroRepository extends JpaRepository<CachorroRepository, Long> {
}
