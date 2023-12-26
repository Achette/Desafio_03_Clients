package com.devsuperior.desafio3.desafio3_clientes.repositories;

import com.devsuperior.desafio3.desafio3_clientes.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
