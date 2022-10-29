package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.Utils.JWTUtil;
import com.example.ventasOtmV2.models.Usuario;
import com.example.ventasOtmV2.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class AuthController {


    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private JWTUtil jwtUtil;


    @PostMapping(value = "/login")
    public String login(@RequestBody Usuario usuario,@RequestHeader(value="Authorization") String token) {

        Usuario usuarioLogueado = usuarioService.verificarUsuario(usuario);

        System.out.println("user: " + usuarioLogueado);
        System.out.println("token: " + token);

        usuarioService.verificarToken(token);


        if (usuarioLogueado != null) {
            String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getId()), usuarioLogueado.getUser());
            return tokenJwt;
        }
        return "auth fail";
    }


}
