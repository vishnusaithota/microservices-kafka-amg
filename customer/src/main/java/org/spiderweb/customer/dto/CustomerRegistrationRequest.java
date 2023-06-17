package org.spiderweb.customer.dto;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
