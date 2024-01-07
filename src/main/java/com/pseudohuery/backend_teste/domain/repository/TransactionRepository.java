package com.pseudohuery.backend_teste.domain.repository;

import com.pseudohuery.backend_teste.domain.model.Transaction;

import java.util.List;

public interface TransactionRepository extends BaseRepository<Transaction, String> {
    void createTransaction(String name, double price);

    List<Transaction> getAllTransactions();
}
