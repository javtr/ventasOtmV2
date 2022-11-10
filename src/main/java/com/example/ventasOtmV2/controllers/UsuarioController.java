package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Usuario;
import com.example.ventasOtmV2.services.ClienteService;
import com.example.ventasOtmV2.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;



    @PostMapping("/save")
    public ResponseEntity<Usuario> add(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.registrarUsuario(usuario)) ;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable Integer id ){
        return ResponseEntity.ok(usuarioService.getUsuario(id)) ;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Usuario>> getAllUsuarios(){
        return ResponseEntity.ok(usuarioService.getAllUsuarios()) ;
    }

    @PutMapping("/edit")
    public ResponseEntity<String> editUsuario(@RequestBody Usuario usuario ){
        ResponseEntity<String> response;

        usuarioService.updateUsuario(usuario);

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad editada");
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUsuario(@PathVariable Integer id ){
        ResponseEntity<String> response;

        usuarioService.deleteUsuario(id);

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad eliminada");
        return response;
    }


    @GetMapping("/get-rol")
    public String getRol(@RequestHeader(value="Authorization") String token){
        return usuarioService.verificarRol(token);
    }

    @GetMapping("/getUserByToken")
    public ResponseEntity<Usuario> getUserToken(@RequestHeader(value="Authorization") String token) {


        System.out.println(token);

        if (usuarioService.verificarToken(token)) {

            return ResponseEntity.ok(usuarioService.getUsuario(Integer.valueOf(usuarioService.verificarId(token))));

        } else {
            return null;

        }
    }





}
