package com.seduc2.senamora.entities;

import jakarta.persistence.*;

@Entity
public class Bloqueio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Usuario usuarioOrigem;
    private String contatoBloqueado;

    public Bloqueio(){}

    public Bloqueio(Usuario usuarioOrigem, String contatoBloqueado) {
        this.usuarioOrigem = usuarioOrigem;
        this.contatoBloqueado = contatoBloqueado;
    }

    public Bloqueio(Long id, Usuario usuarioOrigem, String contatoBloqueado) {
        this.id = id;
        this.usuarioOrigem = usuarioOrigem;
        this.contatoBloqueado = contatoBloqueado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuarioOrigem() {
        return usuarioOrigem;
    }

    public void setUsuarioOrigem(Usuario usuarioOrigem) {
        this.usuarioOrigem = usuarioOrigem;
    }

    public String getContatoBloqueado() {
        return contatoBloqueado;
    }

    public void setContatoBloqueado(String contatoBloqueado) {
        this.contatoBloqueado = contatoBloqueado;
    }
}
