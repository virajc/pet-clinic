package dev.viraj.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3835265580380575614L;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
