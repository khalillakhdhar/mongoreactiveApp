package com.elitech.service;

import com.elitech.model.Auteur;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AuteurService {
	public Mono<Auteur> createAuteur(Auteur auteur);
	public Flux<Auteur> readAllAuteurs();
	public Mono<Auteur> readOneAuteur(String id);
	public void deleteOne(String id);
}
