package com.example.ventasOtmV2.repository;

import com.example.ventasOtmV2.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
    @Query("select u from Cliente u where u.nombre = ?1")
    List<Cliente> findClienteByName(String nombre);

}
