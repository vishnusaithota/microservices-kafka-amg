package org.spiderweb.fraud.repository;

import org.spiderweb.fraud.model.FraudCheckHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudCheckRepository extends MongoRepository<FraudCheckHistory,Integer> {
}
