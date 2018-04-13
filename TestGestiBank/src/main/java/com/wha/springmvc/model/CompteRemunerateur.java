package com.wha.springmvc.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CR")
public class CompteRemunerateur extends Compte{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double taux ;

	public CompteRemunerateur(Client client) {
	super(client);
	
	}
	public CompteRemunerateur() {
		
		
	}
	
	public CompteRemunerateur(double solde, Date dateCreation, double taux,Client client) {
		super(solde, dateCreation, client);
	
		this.taux=taux;
	
	}

	public CompteRemunerateur(int numeroCompte,double solde, Date dateCreation) {
		super(numeroCompte,solde,dateCreation);

	}
	
	
	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	
}
