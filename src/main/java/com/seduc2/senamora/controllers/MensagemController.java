package com.seduc2.senamora.controllers;

import com.seduc2.senamora.entities.Mensagem;
import com.seduc2.senamora.services.MensagemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/mensagens")
public class MensagemController {

    private final MensagemService service;

    public MensagemController(MensagemService service) {
        this.service = service;
    }

    @GetMapping("/{usuario1Id}/{usuario2Id}")
    public List<Mensagem> carregarChat(@PathVariable Long usuario1Id, @PathVariable Long usuario2Id) {
        return service.listarConversa(usuario1Id, usuario2Id);
    }

    @PostMapping
    public void enviarMensagem(@RequestBody Mensagem m) {
        service.enviarMensagem(m);
    }

    @PutMapping("/{id}/curtir")
    public void curtirMensagem(@PathVariable Long id) {
        service.curtirMensagem(id);
    }

    @DeleteMapping("/{id}")
    public void apagarMensagem(@PathVariable Long id) {
        service.deletarMensagem(id);
    }
}
