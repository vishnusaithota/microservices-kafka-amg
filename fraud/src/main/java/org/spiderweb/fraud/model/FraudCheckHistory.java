package org.spiderweb.fraud.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "fraud")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FraudCheckHistory {

    @Id
    private String id;
    private Integer customerId;
    private Boolean isFraud;
    private LocalDateTime createdAt;

}
