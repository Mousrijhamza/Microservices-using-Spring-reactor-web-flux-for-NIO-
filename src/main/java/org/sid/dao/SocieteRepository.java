package org.sid.dao;

import org.sid.entities.Societe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SocieteRepository extends ReactiveMongoRepository<Societe, String> {

}
