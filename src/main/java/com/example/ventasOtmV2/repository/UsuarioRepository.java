package com.example.ventasOtmV2.repository;

import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

}
