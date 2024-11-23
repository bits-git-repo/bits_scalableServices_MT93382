package com.stockbroker.stockbrokingservice.repository;

import com.stockbroker.stockbrokingservice.entity.DepositoryAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositoryAccountRepo extends JpaRepository<DepositoryAccount, Integer> {

}