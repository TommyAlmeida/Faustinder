package org.academiadecodigo.hackatonfundao.faustinder.persistence.dao;

import org.academiadecodigo.hackatonfundao.faustinder.models.Fetish;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class FetishDao extends GenericDao<Fetish> {

    public FetishDao(){
        super(Fetish.class);
    }

    public Fetish findByFetish(Fetish fetish) {

        EntityManager em = getEntityManager();
        CriteriaQuery<Fetish> cq = em.getCriteriaBuilder().createQuery(Fetish.class);
        Root<Fetish> root = cq.from(Fetish.class);

        cq.select(root);
        cq.where(em.getCriteriaBuilder().equal(root.get("name"), fetish));
        return em.createQuery(cq).getSingleResult();
    }
}
