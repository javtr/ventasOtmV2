package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.Utils.JWTUtil;
import com.example.ventasOtmV2.models.Usuario;
import com.example.ventasOtmV2.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@CrossOrigin()
//@CrossOrigin(origins = "https://ventasotmv2-production.up.railway.app")
public class AuthController {


    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private JWTUtil jwtUtil;


    @PostMapping(value = "/login")
    public String login(@RequestBody Usuario usuario) {

        Usuario usuarioLogueado = usuarioService.verificarUsuario(usuario);


        if (usuarioLogueado != null) {
            String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getId()), String.valueOf(usuarioLogueado.getRol()));
            return tokenJwt;
        }
        return "auth fail";
    }


}
