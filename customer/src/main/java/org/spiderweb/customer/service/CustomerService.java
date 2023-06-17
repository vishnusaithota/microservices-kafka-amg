package org.spiderweb.customer.service;

import org.spiderweb.customer.dto.CustomerRegistrationRequest;
import org.spiderweb.customer.model.Customer;
import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
    }
}
