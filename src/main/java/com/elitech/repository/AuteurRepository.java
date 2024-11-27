package com.elitech.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.elitech.model.Auteur;

import reactor.core.publisher.Mono;


public interface AuteurRepository extends ReactiveMongoRepository<Auteur, String> {
	Mono<Auteur>  findByNom(String nom);

}
