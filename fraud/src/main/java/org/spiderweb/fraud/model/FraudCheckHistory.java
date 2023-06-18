package org.spiderweb.fraud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "fraud")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FraudCheckHistory {

    @Id
    private Integer id;
    private Integer customerId;
    private Boolean isFraud;
    private LocalDateTime createdAt;

}
