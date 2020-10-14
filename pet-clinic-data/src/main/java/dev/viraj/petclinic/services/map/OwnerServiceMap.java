package dev.viraj.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import dev.viraj.petclinic.model.Owner;
import dev.viraj.petclinic.services.OwnerService;
@Service
public class OwnerServiceMap extends AbstactMapService<Owner, Long> implements OwnerService{

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
