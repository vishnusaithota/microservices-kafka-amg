package org.spiderweb.customer.service;

import org.spiderweb.customer.dto.CustomerRegistrationRequest;
import org.spiderweb.customer.dto.FraudCheckResponse;
import org.spiderweb.customer.model.Customer;
import org.spiderweb.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.FormatterRegistrar;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.saveAndFlush(customer);

//        check if fraudster or Not
        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://fraud/api/v1/fraud/{customerId}", FraudCheckResponse.class
                ,customer.getId()
        );


        if (fraudCheckResponse != null && fraudCheckResponse.isFraud()){
            throw new IllegalStateException("fraudster");
        }

    }
}
