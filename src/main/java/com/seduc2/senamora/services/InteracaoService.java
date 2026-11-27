package com.seduc2.senamora.services;

import com.seduc2.senamora.entities.Interacao;
import com.seduc2.senamora.entities.TipoInteracao;
import com.seduc2.senamora.repositories.InteracaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InteracaoService {

    private final InteracaoRepository repository;
    public InteracaoService(InteracaoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Interacao registrarSwipe(Interacao novaInteracao) {
        boolean match = false;

        if (novaInteracao.getTipo() != TipoInteracao.DISLIKE) {
            Long origemId = novaInteracao.getUsuarioOrigem().getId();
            Long destinoId = novaInteracao.getUsuarioDestino().getId();

            Optional<Interacao> curtidaReciproca = repository
                    .findByUsuarioOrigemIdAndUsuarioDestinoIdAndTipoIn(
                            destinoId, origemId, List.of(TipoInteracao.LIKE, TipoInteracao.SUPERLIKE)
                    );

            if (curtidaReciproca.isPresent()) {
                match = true;
                curtidaReciproca.get().setDeuMatch(true);
            }
        }

        novaInteracao.setDeuMatch(match);
        return repository.save(novaInteracao);
    }

    public List<Interacao> listarMatches(Long usuarioId) {
        return repository.findByUsuarioOrigemIdAndDeuMatchTrue(usuarioId);
    }

    public void desfazerSwipeOuMatch(Long interacaoId) {
        repository.deleteById(interacaoId);
    }
}
