package com.seduc2.senamora.repositories;

import com.seduc2.senamora.entities.Interacao;
import com.seduc2.senamora.entities.TipoInteracao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InteracaoRepository extends JpaRepository<Interacao, Long> {
    Optional<Interacao> findByUsuarioOrigemIdAndUsuarioDestinoIdAndTipoIn(
            Long origemId, Long destinoId, List<TipoInteracao> tipos);

    List<Interacao> findByUsuarioOrigemIdAndDeuMatchTrue(Long usuarioId);
}
