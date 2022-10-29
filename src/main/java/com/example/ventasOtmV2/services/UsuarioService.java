package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Usuario;

import java.util.List;

public interface UsuarioService {

    public Usuario registrarUsuario(Usuario usuario);
    public Usuario getUsuario(Integer id);
    public List<Usuario> getAllUsuarios();
    public void updateUsuario(Usuario usuario);
    public void deleteUsuario(Integer id);
    public Usuario verificarUsuario(Usuario usuario);

    public boolean verificarToken(String token);

}
