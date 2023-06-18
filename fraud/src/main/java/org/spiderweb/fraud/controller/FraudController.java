package org.spiderweb.fraud.controller;

import lombok.extern.slf4j.Slf4j;
import org.spiderweb.fraud.dto.FraudCheckResponse;
import org.spiderweb.fraud.model.FraudCheckHistory;
import org.spiderweb.fraud.repository.FraudCheckRepository;
import org.spiderweb.fraud.service.FraudCheckService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fraud")
@Slf4j
public record FraudController(FraudCheckService fraudCheckService) {

    @PostMapping("/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {
        boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);

        return new FraudCheckResponse(false);
    }

}
