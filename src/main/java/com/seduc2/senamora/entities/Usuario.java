package com.seduc2.senamora.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    private String sexualidade;
    private String pronome;
    private String emailSenai;
    private String campusSenai;
    private String cursoCargo;
    private String bio;
    private String fotoPrincipal;
    private String hobbies;
    @Enumerated(EnumType.STRING)
    private GeneroInteresse generoInteresse;
    private boolean mostrarPerfil = true;
    private boolean focoCampusSenai = true;
    private boolean modoIncognito = false;

    public Usuario() {}

    public Usuario(String nome, LocalDate dataNascimento, Genero genero, String sexualidade, String pronome, String emailSenai, String campusSenai, String cursoCargo, String bio, String fotoPrincipal, String hobbies, GeneroInteresse generoInteresse, boolean mostrarPerfil, boolean focoCampusSenai, boolean modoIncognito) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.sexualidade = sexualidade;
        this.pronome = pronome;
        this.emailSenai = emailSenai;
        this.campusSenai = campusSenai;
        this.cursoCargo = cursoCargo;
        this.bio = bio;
        this.fotoPrincipal = fotoPrincipal;
        this.hobbies = hobbies;
        this.generoInteresse = generoInteresse;
        this.mostrarPerfil = mostrarPerfil;
        this.focoCampusSenai = focoCampusSenai;
        this.modoIncognito = modoIncognito;
    }

    public Usuario(Long id, String nome, LocalDate dataNascimento, Genero genero, String sexualidade, String pronome, String emailSenai, String campusSenai, String cursoCargo, String bio, String fotoPrincipal, String hobbies, GeneroInteresse generoInteresse, boolean mostrarPerfil, boolean focoCampusSenai, boolean modoIncognito) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.sexualidade = sexualidade;
        this.pronome = pronome;
        this.emailSenai = emailSenai;
        this.campusSenai = campusSenai;
        this.cursoCargo = cursoCargo;
        this.bio = bio;
        this.fotoPrincipal = fotoPrincipal;
        this.hobbies = hobbies;
        this.generoInteresse = generoInteresse;
        this.mostrarPerfil = mostrarPerfil;
        this.focoCampusSenai = focoCampusSenai;
        this.modoIncognito = modoIncognito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getSexualidade() {
        return sexualidade;
    }

    public void setSexualidade(String sexualidade) {
        this.sexualidade = sexualidade;
    }

    public String getPronome() {
        return pronome;
    }

    public void setPronome(String pronome) {
        this.pronome = pronome;
    }

    public String getEmailSenai() {
        return emailSenai;
    }

    public void setEmailSenai(String emailSenai) {
        this.emailSenai = emailSenai;
    }

    public String getCampusSenai() {
        return campusSenai;
    }

    public void setCampusSenai(String campusSenai) {
        this.campusSenai = campusSenai;
    }

    public String getCursoCargo() {
        return cursoCargo;
    }

    public void setCursoCargo(String cursoCargo) {
        this.cursoCargo = cursoCargo;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFotoPrincipal() {
        return fotoPrincipal;
    }

    public void setFotoPrincipal(String fotoPrincipal) {
        this.fotoPrincipal = fotoPrincipal;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public GeneroInteresse getGeneroInteresse() {
        return generoInteresse;
    }

    public void setGeneroInteresse(GeneroInteresse generoInteresse) {
        this.generoInteresse = generoInteresse;
    }

    public boolean isMostrarPerfil() {
        return mostrarPerfil;
    }

    public void setMostrarPerfil(boolean mostrarPerfil) {
        this.mostrarPerfil = mostrarPerfil;
    }

    public boolean isFocoCampusSenai() {
        return focoCampusSenai;
    }

    public void setFocoCampusSenai(boolean focoCampusSenai) {
        this.focoCampusSenai = focoCampusSenai;
    }

    public boolean isModoIncognito() {
        return modoIncognito;
    }

    public void setModoIncognito(boolean modoIncognito) {
        this.modoIncognito = modoIncognito;
    }
}
