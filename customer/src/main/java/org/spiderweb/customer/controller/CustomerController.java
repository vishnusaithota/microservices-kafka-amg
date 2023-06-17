package org.spiderweb.customer.controller;

import lombok.extern.slf4j.Slf4j;
import org.spiderweb.customer.dto.CustomerRegistrationRequest;
import org.spiderweb.customer.service.CustomerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
@Slf4j
public record CustomerController(CustomerService customerService) {

    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){
        log.info("new Customer registration {}",customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }


}
