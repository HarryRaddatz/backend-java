package com.pseudohuery.backend_teste.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pseudohuery.backend_teste.domain.model.Client;
import com.pseudohuery.backend_teste.domain.repository.ClientRepository;

@Service
public class ClientService extends BaseService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return this.clientRepository.findAll();
    };
}
