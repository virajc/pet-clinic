package dev.viraj.petclinic.services;

import dev.viraj.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);

}
