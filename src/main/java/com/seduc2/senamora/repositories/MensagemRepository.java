package com.seduc2.senamora.repositories;

import com.seduc2.senamora.entities.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
    List<Mensagem> findByRemetenteIdAndDestinatarioIdOrRemetenteIdAndDestinatarioIdOrderByDataEnvioAsc(
            Long rem1, Long dest1, Long rem2, Long dest2);
}