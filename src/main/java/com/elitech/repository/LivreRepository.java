package com.elitech.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.elitech.model.Livre;

import reactor.core.publisher.Flux;


public interface LivreRepository extends ReactiveMongoRepository<Livre, String> {
Flux<Livre> findByGenre(String genre);
}
