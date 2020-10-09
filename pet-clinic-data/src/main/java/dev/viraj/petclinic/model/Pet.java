package dev.viraj.petclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1908244682587526040L;
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
