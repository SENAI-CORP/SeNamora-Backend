package com.seduc2.senamora.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Usuario remetente;
    @ManyToOne
    private Usuario destinatario;
    private String texto;
    private String imagemUrl;
    private boolean curtida;
    private LocalDateTime dataEnvio;

    public Mensagem(){}

    public Mensagem(Usuario remetente, Usuario destinatario, String texto, String imagemUrl, boolean curtida, LocalDateTime dataEnvio) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.texto = texto;
        this.imagemUrl = imagemUrl;
        this.curtida = curtida;
        this.dataEnvio = dataEnvio;
    }

    public Mensagem(Long id, Usuario remetente, Usuario destinatario, String texto, String imagemUrl, boolean curtida, LocalDateTime dataEnvio) {
        this.id = id;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.texto = texto;
        this.imagemUrl = imagemUrl;
        this.curtida = curtida;
        this.dataEnvio = dataEnvio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public boolean isCurtida() {
        return curtida;
    }

    public void setCurtida(boolean curtida) {
        this.curtida = curtida;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
}
