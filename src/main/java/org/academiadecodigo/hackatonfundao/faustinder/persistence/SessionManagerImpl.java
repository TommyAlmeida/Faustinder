package org.academiadecodigo.hackatonfundao.faustinder.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class SessionManagerImpl implements SessionManager{

    private EntityManagerFactory emf; // the persistence unit
    private EntityManager em; // the persistence context

    public void startSession() {

        if (em == null) {
            em = emf.createEntityManager();
        }
    }

    public void stopSession() {
        if (em != null) {
            em.close();
        }

        em = null;
    }

    public EntityManager getCurrentSession() {
        startSession();
        return em;
    }
}
