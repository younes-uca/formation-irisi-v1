package  ma.formation.irisi.dao.specification.core.commun;

import ma.formation.irisi.dao.criteria.core.commun.ProduitCriteria;
import ma.formation.irisi.bean.core.commun.Produit;
import ma.formation.irisi.zynerator.specification.AbstractSpecification;


public class ProduitSpecification extends  AbstractSpecification<ProduitCriteria, Produit>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("barcode", criteria.getBarcode(),criteria.getBarcodeLike());
        addPredicate("discription", criteria.getDiscription(),criteria.getDiscriptionLike());
        addPredicateBigDecimal("prixAchatMoyen", criteria.getPrixAchatMoyen(), criteria.getPrixAchatMoyenMin(), criteria.getPrixAchatMoyenMax());
        addPredicateBigDecimal("quantite", criteria.getQuantite(), criteria.getQuantiteMin(), criteria.getQuantiteMax());
        addPredicateBigDecimal("seuilAlert", criteria.getSeuilAlert(), criteria.getSeuilAlertMin(), criteria.getSeuilAlertMax());
        addPredicateFk("categorieProduit","id", criteria.getCategorieProduit()==null?null:criteria.getCategorieProduit().getId());
        addPredicateFk("categorieProduit","id", criteria.getCategorieProduits());
        addPredicateFk("categorieProduit","reference", criteria.getCategorieProduit()==null?null:criteria.getCategorieProduit().getReference());
    }

    public ProduitSpecification(ProduitCriteria criteria) {
        super(criteria);
    }

    public ProduitSpecification(ProduitCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
