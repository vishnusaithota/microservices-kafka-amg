package org.spiderweb.customer.service;

import org.spiderweb.customer.dto.CustomerRegistrationRequest;
import org.spiderweb.customer.model.Customer;
import org.spiderweb.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.save(customer);
    }
}
