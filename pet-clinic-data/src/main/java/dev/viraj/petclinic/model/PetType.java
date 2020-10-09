package dev.viraj.petclinic.model;

public class PetType extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1712167944134172516L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
