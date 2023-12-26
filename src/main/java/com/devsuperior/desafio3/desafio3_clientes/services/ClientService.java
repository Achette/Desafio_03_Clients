package com.devsuperior.desafio3.desafio3_clientes.services;

import com.devsuperior.desafio3.desafio3_clientes.dto.ClientDTO;
import com.devsuperior.desafio3.desafio3_clientes.entity.Client;
import com.devsuperior.desafio3.desafio3_clientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> client = repository.findAll(pageable);
        return client.map(item -> new ClientDTO(item));
    }
}
