package org.example.demo.ecommerce.model.bean.projet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Entreprise implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3788175734710731165L;
	
	private Long code;
	private String nom;
	private String raisonSociale;
	private String email;
	private Collection<Taxe> taxes;
	
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public Collection<Taxe> getTaxes() {
		return taxes;
	}
	public void setTaxes(Collection<Taxe> taxes) {
		this.taxes = taxes;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entreprise(Long code, String nom, String raisonSociale) {
		super();
		this.code = code;
		this.nom = nom;
		this.raisonSociale = raisonSociale;
	}
	public Entreprise(Long code, String nom, String raisonSociale, String email) {
		super();
		this.code = code;
		this.nom = nom;
		this.raisonSociale = raisonSociale;
		this.email = email;
	}
	
	public List<Entreprise> getListEntreprise() {
        // Je n'ai pas encore codé la DAO
        // Je mets juste un code temporaire pour commencer le cours...
        List<Entreprise> vList = new ArrayList<>();
        for (int vI = 0; vI < 9; vI++) {
        	Entreprise vEntreprise = new Entreprise();
            vEntreprise.setNom("Entreprise n°" + vI);
            vList.add(vEntreprise);
        }
        return vList;
    }
	
	public Entreprise getEntreprise() {
        
        Entreprise e = new Entreprise();
        	Entreprise vEntreprise = new Entreprise();
            vEntreprise.setNom("Entreprise n°1" );
           
        return e;
    }
	
	

}
