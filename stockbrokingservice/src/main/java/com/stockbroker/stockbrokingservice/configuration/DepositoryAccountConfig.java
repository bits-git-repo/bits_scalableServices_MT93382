package com.stockbroker.stockbrokingservice.configuration;

import com.stockbroker.stockbrokingservice.service.DepositoryAccountService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepositoryAccountConfig {

    @Bean
    public DepositoryAccountService depositoryAccountBean() {
        return new DepositoryAccountService();
    }

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }

}
