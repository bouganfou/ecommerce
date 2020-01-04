package org.example.demo.ecommerce.model.recherche.ecommerce;

/**
 * Classe de critères de recherche de Entreprise.
 *
 * @author lgu
 */
public class RechercheEntreprise {

    // ==================== Attributs ====================
    private Integer projetId;
    private Integer auteurId;


    // ==================== Constructeurs ====================
    /**
     * Constructeur par défaut.
     */
    public RechercheEntreprise() {

    }


    // ==================== Getters/Setters ====================
    public Integer getAuteurId() {
        return auteurId;
    }

    /**
     * Assigne le critère de recherche : id de l'auteur.
     *
     * @param pAuteurId -
     * @return {@code this}
     */
    public RechercheEntreprise setAuteurId(Integer pAuteurId) {
        auteurId = pAuteurId;
        return this;
    }

    public Integer getProjetId() {
        return projetId;
    }

    /**
     * Assigne le critère de recherche : id du projet.
     *
     * @param pProjetId -
     * @return {@code this}
     */
    public RechercheEntreprise setProjetId(Integer pProjetId) {
        projetId = pProjetId;
        return this;
    }
}
