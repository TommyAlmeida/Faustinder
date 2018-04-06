package org.academiadecodigo.hackatonfundao.faustinder.persistence.dao;

import org.academiadecodigo.hackatonfundao.faustinder.models.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class UserDao extends GenericDao<User> {


    public UserDao() {
        super(User.class);
    }

    public User findByUsername(String username){
        EntityManager em = getEntityManager();

        CriteriaQuery<User> cq = em.getCriteriaBuilder().createQuery(User.class);
        Root<User> root = cq.from(User.class);
        cq.select(root);
        cq.where(em.getCriteriaBuilder().equal(root.get("username"), username));


        return em.createQuery(cq).getSingleResult();
    }

}
