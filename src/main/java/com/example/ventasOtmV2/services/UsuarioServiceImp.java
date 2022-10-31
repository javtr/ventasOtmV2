package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.Utils.JWTUtil;
import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Usuario;
import com.example.ventasOtmV2.repository.ClienteRepository;
import com.example.ventasOtmV2.repository.UsuarioRepository;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
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

    @Autowired
    private JWTUtil jwtUtil;


    @Override
    public Usuario registrarUsuario(Usuario usuario)
    {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1,1024,1,usuario.getPassword());
        usuario.setPassword(hash);

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
    public Usuario verificarUsuario(Usuario usuario) {
        String jpql = "SELECT u FROM Usuario u WHERE u.user=:user ";
        List<Usuario> returnUser = em.createQuery(jpql)
            .setParameter("user", usuario.getUser())
            .getResultList();

        //verificar si el usuario existe
        if (returnUser.isEmpty()) {
            return null;
        }

        //obtener el password del usuario
        String passwordHashed = returnUser.get(0).getPassword();

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

        //si coinciden los password retornar el usuario
        if (argon2.verify(passwordHashed, usuario.getPassword())) {
            return returnUser.get(0);
        }
        //si no coinciden retornar null
        return null;

    }

    @Override
    public boolean verificarToken(String token) {
        String usuarioId = jwtUtil.getKey(token);

        return usuarioId != null;
    }


    @Override
    public String verificarId(String token) {
        String usuarioId = jwtUtil.getKey(token);

        if (usuarioId != null || usuarioId != ""){
            return usuarioId;
        }
        else{
            return "";
        }

    }

    @Override
    public String verificarRol(String token) {
        String usuarioValue = jwtUtil.getValue(token);

        if (usuarioValue != null || usuarioValue != ""){
            return usuarioValue;
        }
        else{
            return "";
        }

    }

}