package br.uespi.republikanos.republikanos_api.infrastructure.repository;

import br.uespi.republikanos.republikanos_api.infrastructure.entity.Anuncio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
}
