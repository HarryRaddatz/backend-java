package com.pseudohuery.backend_teste.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pseudohuery.backend_teste.domain.model.Transaction;
import com.pseudohuery.backend_teste.domain.repository.TransactionRepository;

@Service
public class TransactionService extends BaseService {
    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return this.transactionRepository.findAll();
    };
}
