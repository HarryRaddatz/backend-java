package com.pseudohuery.backend_teste.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pseudohuery.backend_teste.domain.model.Bank;
import com.pseudohuery.backend_teste.domain.repository.BankRepository;

@Service
public class BankService extends BaseService {
    @Autowired
    BankRepository BankRepository;

    public List<Bank> getAllBanks() {
        return this.BankRepository.findAll();
    };
}
