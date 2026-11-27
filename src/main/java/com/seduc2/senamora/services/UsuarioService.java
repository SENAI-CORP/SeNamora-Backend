package com.seduc2.senamora.services;

import com.seduc2.senamora.entities.Usuario;
import com.seduc2.senamora.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario criarUsuario(Usuario u) {
        return repository.save(u);
    }

    public List<Usuario> listarFeedDescobrir() {
        return repository.findByMostrarPerfilTrue();
    }

    public Usuario buscarPorId(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void deletarUsuario(Long id) {
        repository.deleteById(id);
    }

    @Transactional
    public Usuario alterarPerfilEPreferencias(Long id, Usuario dadosAtualizados) {
        Usuario usuario = repository.getReferenceById(id);
        usuario.setNome(dadosAtualizados.getNome());
        usuario.setDataNascimento(dadosAtualizados.getDataNascimento());
        usuario.setGenero(dadosAtualizados.getGenero());
        usuario.setSexualidade(dadosAtualizados.getSexualidade());
        usuario.setPronome(dadosAtualizados.getPronome());
        usuario.setEmailSenai(dadosAtualizados.getEmailSenai());
        usuario.setCampusSenai(dadosAtualizados.getCampusSenai());
        usuario.setCursoCargo(dadosAtualizados.getCursoCargo());
        usuario.setBio(dadosAtualizados.getBio());
        usuario.setFotoPrincipal(dadosAtualizados.getFotoPrincipal());
        usuario.setHobbies(dadosAtualizados.getHobbies());
        usuario.setGeneroInteresse(dadosAtualizados.getGeneroInteresse());
        usuario.setMostrarPerfil(dadosAtualizados.isMostrarPerfil());
        usuario.setFocoCampusSenai(dadosAtualizados.isFocoCampusSenai());
        usuario.setModoIncognito(dadosAtualizados.isModoIncognito());
        return repository.save(usuario);
    }
}
