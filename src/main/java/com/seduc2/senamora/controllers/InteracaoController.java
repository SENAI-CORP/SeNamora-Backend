package com.seduc2.senamora.controllers;

import com.seduc2.senamora.entities.Interacao;
import com.seduc2.senamora.services.InteracaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/interacoes")
public class InteracaoController {

    private final InteracaoService service;

    public InteracaoController(InteracaoService service) {
        this.service = service;
    }

    @PostMapping
    public Interacao darSwipe(@RequestBody Interacao interacao) {
        return service.registrarSwipe(interacao);
    }

    @GetMapping("/matches/{usuarioId}")
    public List<Interacao> listarMatches(@PathVariable Long usuarioId) {
        return service.listarMatches(usuarioId);
    }

    @DeleteMapping("/{id}")
    public void desfazerInteracao(@PathVariable Long id) {
        service.desfazerSwipeOuMatch(id);
    }
}
