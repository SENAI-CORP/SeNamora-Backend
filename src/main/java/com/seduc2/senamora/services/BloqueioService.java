package com.seduc2.senamora.services;

import com.seduc2.senamora.entities.Bloqueio;
import com.seduc2.senamora.repositories.BloqueioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloqueioService {

    private final BloqueioRepository repository;
    public BloqueioService(BloqueioRepository repository) {
        this.repository = repository;
    }

    public void bloquearContato(Bloqueio b) {
        repository.save(b);
    }

    public List<Bloqueio> listarBloqueados(Long usuarioId) {
        return repository.findByUsuarioOrigemId(usuarioId);
    }

    public void desbloquear(Long id) {
        repository.deleteById(id);
    }
}
