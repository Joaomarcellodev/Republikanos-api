package br.uespi.republikanos.republikanos_api.infrastructure.repository;

import br.uespi.republikanos.republikanos_api.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
