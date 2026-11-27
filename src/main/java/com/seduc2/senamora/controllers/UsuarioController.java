package com.seduc2.senamora.controllers;

import com.seduc2.senamora.entities.Usuario;
import com.seduc2.senamora.services.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> listarFeed() {
        return service.listarFeedDescobrir();
    }

    @GetMapping("/{id}")
    public Usuario buscarPerfil(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody Usuario u) {
        return service.criarUsuario(u);
    }

    @PutMapping("/{id}")
    public Usuario atualizarPerfil(@PathVariable Long id, @RequestBody Usuario u) {
        return service.alterarPerfilEPreferencias(id, u);
    }

    @DeleteMapping("/{id}")
    public void deletarConta(@PathVariable Long id) {
        service.deletarUsuario(id);
    }
}
