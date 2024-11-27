package com.elitech.service;

import com.elitech.model.Livre;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LivreService {
public Mono<Livre> createLivre(Livre livre,String nomAuteur);
public Flux<Livre> readAllLivres();
public Mono<Livre> readOneLivre(String id);
public void deleteOne(String id);
}
