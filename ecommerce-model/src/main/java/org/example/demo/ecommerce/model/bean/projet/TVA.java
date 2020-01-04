package org.example.demo.ecommerce.model.bean.projet;

import java.util.Date;


public class TVA extends Taxe{

	public TVA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TVA(Long id, String titre, Date dateTaxe, double montant, Entreprise entreprise) {
		super(id, titre, dateTaxe, montant, entreprise);
		// TODO Auto-generated constructor stub
	}
	

}
