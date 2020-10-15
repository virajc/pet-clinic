package dev.viraj.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import dev.viraj.petclinic.model.Pet;
import dev.viraj.petclinic.services.CrudService;
@Service
public class PetServiceMap extends AbstactMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Pet object) {
		return super.save( object);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
}
