package com.seduc2.senamora.entities;

import jakarta.persistence.*;

@Entity
public class Interacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Usuario usuarioOrigem;
    @ManyToOne
    private Usuario usuarioDestino;
    @Enumerated(EnumType.STRING)
    private TipoInteracao tipo;
    private boolean deuMatch;

    public Interacao(){}

    public Interacao(Usuario usuarioOrigem, Usuario usuarioDestino, TipoInteracao tipo, boolean deuMatch) {
        this.usuarioOrigem = usuarioOrigem;
        this.usuarioDestino = usuarioDestino;
        this.tipo = tipo;
        this.deuMatch = deuMatch;
    }

    public Interacao(Long id, Usuario usuarioOrigem, Usuario usuarioDestino, TipoInteracao tipo, boolean deuMatch) {
        this.id = id;
        this.usuarioOrigem = usuarioOrigem;
        this.usuarioDestino = usuarioDestino;
        this.tipo = tipo;
        this.deuMatch = deuMatch;
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

    public Usuario getUsuarioDestino() {
        return usuarioDestino;
    }

    public void setUsuarioDestino(Usuario usuarioDestino) {
        this.usuarioDestino = usuarioDestino;
    }

    public TipoInteracao getTipo() {
        return tipo;
    }

    public void setTipo(TipoInteracao tipo) {
        this.tipo = tipo;
    }

    public boolean isDeuMatch() {
        return deuMatch;
    }

    public void setDeuMatch(boolean deuMatch) {
        this.deuMatch = deuMatch;
    }
}
