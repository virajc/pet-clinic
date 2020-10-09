package dev.viraj.petclinic.services;

import java.util.Set;

import dev.viraj.petclinic.model.Vet;


public interface VetService {
	Vet findById(Long id);

	Vet save(Vet pet);

	Set<Vet> findAll();
}
