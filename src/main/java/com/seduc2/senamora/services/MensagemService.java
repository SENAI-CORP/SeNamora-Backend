package com.seduc2.senamora.services;

import com.seduc2.senamora.entities.Mensagem;
import com.seduc2.senamora.repositories.MensagemRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MensagemService {

    private final MensagemRepository repository;
    public MensagemService(MensagemRepository repository) {
        this.repository = repository;
    }

    public void enviarMensagem(Mensagem m) {
        m.setDataEnvio(LocalDateTime.now());
        repository.save(m);
    }

    public List<Mensagem> listarConversa(Long usuario1Id, Long usuario2Id) {
        return repository.findByRemetenteIdAndDestinatarioIdOrRemetenteIdAndDestinatarioIdOrderByDataEnvioAsc(
                usuario1Id, usuario2Id, usuario2Id, usuario1Id
        );
    }

    @Transactional
    public void curtirMensagem(Long id) {
        Mensagem msg = repository.getReferenceById(id);
        msg.setCurtida(!msg.isCurtida());
    }

    public void deletarMensagem(Long id) {
        repository.deleteById(id);
    }
}
