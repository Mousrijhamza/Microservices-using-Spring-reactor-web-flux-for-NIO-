package org.sid.dao;

import org.sid.entities.Societe;
import org.sid.entities.Transaction;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String> {

    Flux<Transaction> findTransactionsBySociete_Nom(String id);
}
