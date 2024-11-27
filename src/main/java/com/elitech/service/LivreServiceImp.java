package com.elitech.service;

import org.springframework.stereotype.Service;

import com.elitech.model.Livre;
import com.elitech.repository.AuteurRepository;
import com.elitech.repository.LivreRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
@RequiredArgsConstructor
public class LivreServiceImp implements LivreService {

	private final LivreRepository livreRepository;
	private final AuteurRepository auteurRepository;
	
	
	@Override
	public Mono<Livre> createLivre(Livre livre, String nomAuteur) {
		// TODO Auto-generated method stub
		return auteurRepository.findByNom(nomAuteur)
				.flatMap(auteur->{
					livre.setAuteur(auteur);
					return livreRepository.save(livre);
				})
				
				;
	}

	@Override
	public Flux<Livre> readAllLivres() {
		// TODO Auto-generated method stub
		return livreRepository.findAll();
	}

	@Override
	public Mono<Livre> readOneLivre(String id) {
		// TODO Auto-generated method stub
		return livreRepository.findById(id);
	}

	@Override
	public void deleteOne(String id) {
		// TODO Auto-generated method stub
		livreRepository.deleteById(id);
	}

}
