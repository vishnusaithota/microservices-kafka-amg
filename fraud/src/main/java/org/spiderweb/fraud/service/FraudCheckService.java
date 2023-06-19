package org.spiderweb.fraud.service;

import org.spiderweb.fraud.model.FraudCheckHistory;
import org.spiderweb.fraud.repository.FraudCheckRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public record FraudCheckService(FraudCheckRepository fraudCheckRepository) {

    public Boolean isFraudulentCustomer(Integer customerId) {
        fraudCheckRepository.save(
                FraudCheckHistory.builder()
                        .id(UUID.randomUUID().toString())
                        .isFraud(false)
                        .customerId(customerId)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }

    public List<FraudCheckHistory> getAll() {
        return fraudCheckRepository.findAll();
    }
}
