package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.Utils.JWTUtil;
import com.example.ventasOtmV2.models.Usuario;
import com.example.ventasOtmV2.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@CrossOrigin
public class AuthController {


    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private JWTUtil jwtUtil;


    @PostMapping(value = "/login")
    public Usuario login(@RequestBody Usuario usuario) {

        System.out.println("login --------------");
        System.out.println(usuario);

        Usuario usuarioLogueado = usuarioService.verificarUsuario(usuario);

        System.out.println("logueado");
        System.out.println(usuarioLogueado);


        if (usuarioLogueado != null) {
            String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getId()), String.valueOf(usuarioLogueado.getRol()));
            Usuario returnUser = new Usuario(usuarioLogueado.getUser(), usuarioLogueado.getId(), usuarioLogueado.getRol(), tokenJwt);
            return returnUser;
        }
        return null;
    }


}
