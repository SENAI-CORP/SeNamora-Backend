package com.seduc2.senamora.controllers;

import com.seduc2.senamora.entities.Bloqueio;
import com.seduc2.senamora.services.BloqueioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/bloqueios")
public class BloqueioController {

    private final BloqueioService service;

    public BloqueioController(BloqueioService service) {
        this.service = service;
    }

    @GetMapping("/{usuarioId}")
    public List<Bloqueio> listar(@PathVariable Long usuarioId) {
        return service.listarBloqueados(usuarioId);
    }

    @PostMapping
    public void bloquear(@RequestBody Bloqueio b) {
        service.bloquearContato(b);
    }

    @DeleteMapping("/{id}")
    public void desbloquear(@PathVariable Long id) {
        service.desbloquear(id);
    }
}
