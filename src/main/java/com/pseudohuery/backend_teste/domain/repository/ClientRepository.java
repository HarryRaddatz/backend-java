package com.pseudohuery.backend_teste.domain.repository;

import com.pseudohuery.backend_teste.domain.model.Client;

import java.util.List;

public interface ClientRepository extends BaseRepository<Client, String> {
    void createUser(String name, double price);

    List<Client> getAllClients();
}
