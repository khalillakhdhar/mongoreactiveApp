package com.elitech.service;

import org.springframework.stereotype.Service;

import com.elitech.model.Auteur;
import com.elitech.repository.AuteurRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AuteurServiceImp implements AuteurService{
	final AuteurRepository auteurRepository;
	
	@Override
	public Mono<Auteur> createAuteur(Auteur auteur) {
		// TODO Auto-generated method stub
		return auteurRepository.save(auteur);
	}

	@Override
	public Flux<Auteur> readAllAuteurs() {
		// TODO Auto-generated method stub
		return auteurRepository.findAll();
	}

	@Override
	public Mono<Auteur> readOneAuteur(String id) {
		// TODO Auto-generated method stub
		return auteurRepository.findById(id);
	}

	@Override
	public void deleteOne(String id) {
		// TODO Auto-generated method stub
		auteurRepository.deleteById(id);
	}
	

}
