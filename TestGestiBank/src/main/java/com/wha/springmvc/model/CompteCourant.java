package com.wha.springmvc.model;



import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double decouvert;
	
	public CompteCourant () {

	}

	public CompteCourant (Client client) {
super(client);
	}
	
	public CompteCourant (double solde, Date dateCreation, double decouvert,Client client ) {
		super(solde, dateCreation, client);
	
		this.decouvert = decouvert;
	
	}
	
	public CompteCourant(int numeroCompte,double solde, Date dateCreation) {
		super(numeroCompte,solde,dateCreation);

	}
	

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	
	
	
	
}

