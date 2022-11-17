package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.Utils.JWTUtil;
import com.example.ventasOtmV2.models.Usuario;
import com.example.ventasOtmV2.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@RestController
@CrossOrigin
@RequestMapping("/user")
public class AuthController {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");
            }
        };
    }


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
