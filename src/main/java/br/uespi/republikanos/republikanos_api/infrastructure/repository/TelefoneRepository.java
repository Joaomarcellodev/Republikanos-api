package br.uespi.republikanos.republikanos_api.infrastructure.repository;

import br.uespi.republikanos.republikanos_api.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
