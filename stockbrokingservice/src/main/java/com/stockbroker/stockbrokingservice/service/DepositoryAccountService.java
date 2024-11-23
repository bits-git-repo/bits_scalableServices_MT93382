package com.stockbroker.stockbrokingservice.service;

import com.stockbroker.stockbrokingservice.entity.DepositoryAccount;
import com.stockbroker.stockbrokingservice.repository.DepositoryAccountRepo;
import com.stockbroker.stockbrokingservice.response.DepositoryAccountResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

public class DepositoryAccountService {

    @Autowired
    private DepositoryAccountRepo depositoryAccountRepo;
    
    @Autowired
    private ModelMapper mapper;

    public DepositoryAccountResponse getDepositoryAccountById(int id) {
        Optional<DepositoryAccount> depositoryAccount = depositoryAccountRepo.findById(id);
        DepositoryAccountResponse depositoryAccountResponse = mapper.map(depositoryAccount, DepositoryAccountResponse.class);
        return depositoryAccountResponse;
    }
    
    public DepositoryAccount openDepositoryAccount(DepositoryAccount depositoryAccount)
    {
    	return depositoryAccountRepo.save(depositoryAccount);
    }
    
    public DepositoryAccount updateDepositoryAccount(int id, DepositoryAccount updatedAccount) {
        Optional<DepositoryAccount> existingAccountOpt = depositoryAccountRepo.findById(id);

        if (existingAccountOpt.isPresent()) {
            DepositoryAccount existingAccount = existingAccountOpt.get();

            existingAccount.setAccountStatus("C");           
            existingAccount.setDateClosed(Date.valueOf(LocalDate.now()));

            return depositoryAccountRepo.save(existingAccount);
            
        } else {
            throw new RuntimeException("Depository Account not found with ID: " + id);
        }
    }

}