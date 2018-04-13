package com.wha.springmvc.model;

import java.util.Collection;
import java.util.LinkedList;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity(name = "Administrator")
@DiscriminatorValue("ADMIN")

public class Administrator extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="administrator",fetch = FetchType.EAGER,orphanRemoval = true)
    private Collection<Conseiller> conseillers = new LinkedList<>();

	public Administrator() {
		super();
		
	}

	public Administrator(Collection<Conseiller> conseillers) {
		super();
		this.conseillers = conseillers;
	}

	

	public Collection<Conseiller> getConseillers() {
		return conseillers;
	}

	public void setConseillers(Collection<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}
	
	
	
	
	

}
