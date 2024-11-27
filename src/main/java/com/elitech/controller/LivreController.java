package com.elitech.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elitech.model.Livre;
import com.elitech.service.LivreService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/livres")
@RequiredArgsConstructor
public class LivreController {
	private final LivreService livreService;
	@PostMapping
	public Mono<Livre> addOne(@RequestBody Livre livre, @RequestParam String nomAuteur)
	{
		return livreService.createLivre(livre, nomAuteur);
	}
	@GetMapping
	public Flux<Livre> getAll()
	{
		return livreService.readAllLivres();
	}
	@GetMapping("/{id}")
	public Mono<Livre> ReadOne(@PathVariable String id)
	{
		return livreService.readOneLivre(id);
	}
	@DeleteMapping("/{id}")
	public void deleteOne(@PathVariable String id)
	{
		livreService.deleteOne(id);
	}

}
