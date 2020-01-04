package org.example.demo.ecommerce.business.manager;

import java.util.ArrayList;
import org.example.demo.ecommerce.model.bean.projet.*;
import java.util.Date;
import java.util.List;


public  class TaxeManager {
	private Long id;
	private String titre;
	private Date dateTaxe;
	private double montant;
	
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

	public void Taxe() {
		
	}
	
	public List<Taxe> getListTaxe() {
        
        List<Taxe> vList = new ArrayList<>();
        for (int vI = 0; vI < 9; vI++) {
        	Taxe vTaxe = new Taxe() {
			};
            vTaxe.setTitre("Taxe n°" + vI);
            vTaxe.setMontant(200L);
            vList.add(vTaxe);
        }
        return vList;
    }
}
