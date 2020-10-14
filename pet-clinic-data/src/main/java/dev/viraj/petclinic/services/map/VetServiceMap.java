package dev.viraj.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import dev.viraj.petclinic.model.Vet;
import dev.viraj.petclinic.services.VetService;
@Service
public class VetServiceMap extends AbstactMapService<Vet, Long> implements VetService {

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

}
