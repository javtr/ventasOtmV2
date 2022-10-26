package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Usuario;
import com.example.ventasOtmV2.repository.ClienteRepository;
import com.example.ventasOtmV2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PersistenceContext
    EntityManager em = null;


    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario getUsuario(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Integer id) {
        usuarioRepository.deleteById(id);

    }

    @Override
    public boolean verificarUsuario(Usuario usuario) {
        String jpql = "SELECT c FROM Usuario u WHERE u.user=:id AND u.password=:password";
        List<Usuario> returnUser = em.createQuery(jpql)
            .setParameter("id", usuario.getUser())
            .setParameter("password", usuario.getPassword())
            .getResultList();

        return !returnUser.isEmpty();

    }
}