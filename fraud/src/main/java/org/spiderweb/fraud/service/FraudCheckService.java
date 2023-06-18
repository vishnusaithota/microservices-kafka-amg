package org.spiderweb.fraud.service;

import org.spiderweb.fraud.repository.FraudCheckRepository;
import org.springframework.stereotype.Service;

@Service
public record FraudCheckService(FraudCheckRepository fraudCheckRepository) {

    public Boolean isFraudulentCustomer(Integer customerId) {
        return false;
    }
}
