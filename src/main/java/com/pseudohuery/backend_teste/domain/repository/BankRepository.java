package com.pseudohuery.backend_teste.domain.repository;

import com.pseudohuery.backend_teste.domain.model.Bank;

import java.util.List;

public interface BankRepository extends BaseRepository<Bank, String> {
    void createBank(String name, double price);

    List<Bank> getAllBanks();
}
