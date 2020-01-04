package org.example.demo.ecommerce.model.bean.projet;

import java.io.Serializable;
import java.util.Date;


public abstract class Taxe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2874006139615225475L;
	
	private Long id;
	private String titre;
	private Date dateTaxe;
	private double montant;
	
	private Entreprise entreprise;
	
	public Taxe(Long id, String titre, Date dateTaxe, double montant, Entreprise entreprise) {
		super();
		this.id = id;
		this.titre = titre;
		this.dateTaxe = dateTaxe;
		this.montant = montant;
		this.entreprise = entreprise;
	}
	public Taxe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDateTaxe() {
		return dateTaxe;
	}
	public void setDateTaxe(Date dateTaxe) {
		this.dateTaxe = dateTaxe;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	

}
