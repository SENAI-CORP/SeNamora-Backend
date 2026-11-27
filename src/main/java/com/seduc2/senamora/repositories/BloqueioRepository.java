package com.seduc2.senamora.repositories;

import com.seduc2.senamora.entities.Bloqueio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BloqueioRepository extends JpaRepository<Bloqueio, Long> {
    List<Bloqueio> findByUsuarioOrigemId(Long usuarioId);
}
