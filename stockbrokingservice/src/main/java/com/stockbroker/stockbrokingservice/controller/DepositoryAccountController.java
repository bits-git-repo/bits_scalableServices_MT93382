package com.stockbroker.stockbrokingservice.controller;

import com.stockbroker.stockbrokingservice.entity.DepositoryAccount;
import com.stockbroker.stockbrokingservice.response.DepositoryAccountResponse;
import com.stockbroker.stockbrokingservice.service.DepositoryAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*")  // Allow all origins for testing
@RestController
//@RequestMapping("/api/openDepositoryAccount")
@RequestMapping("/api/DepositoryAccount")
public class DepositoryAccountController {

    @Autowired
    private DepositoryAccountService depositoryAccountService;

    //@GetMapping("/depositoryaccounts/{id}")
    @GetMapping("/{id}")
    private ResponseEntity<DepositoryAccountResponse> getDepositoryAccountDetails(@PathVariable("id") int id) {
        DepositoryAccountResponse depositoryAccount = depositoryAccountService.getDepositoryAccountById(id);
        return ResponseEntity.status(HttpStatus.OK).body(depositoryAccount);
    }
    
    @PostMapping
    public ResponseEntity<DepositoryAccount> openDepositoryAccount(@RequestBody DepositoryAccount depositoryAccount)
    {
    	DepositoryAccount depositoryAccountCreated = depositoryAccountService.openDepositoryAccount(depositoryAccount);
    	return new ResponseEntity<>(depositoryAccountCreated, HttpStatus.CREATED);

    }
    
    //@PutMapping("/api/closeDepositoryAccount/{id}")
    @PutMapping("/{depositoryAccountId}")
    public ResponseEntity<DepositoryAccount> closeDepositoryAccount (
            @PathVariable("depositoryAccountId") int depositoryAccountId,
            @RequestBody DepositoryAccount closedAccount) {
        
    	System.out.println("Received PUT request for ID: " + depositoryAccountId);
        System.out.println("Updated Account: " + closedAccount);
    	DepositoryAccount closedDepositoryAccount = depositoryAccountService.updateDepositoryAccount(depositoryAccountId, closedAccount);
        return new ResponseEntity<>(closedDepositoryAccount, HttpStatus.OK);
    }


}