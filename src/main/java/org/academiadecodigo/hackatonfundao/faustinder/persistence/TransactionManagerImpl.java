package org.academiadecodigo.hackatonfundao.faustinder.persistence;

import javax.persistence.EntityManager;

public class TransactionManagerImpl implements TransactionManager {

    private SessionManager sm;

    @Override
    public void beginRead() {
        sm.startSession();
    }

    @Override
    public void beginWrite() {
        sm.getCurrentSession().getTransaction().begin();
    }

    @Override
    public void commit() {

        if (sm.getCurrentSession().getTransaction().isActive()) {
            sm.getCurrentSession().getTransaction().commit();
        }
        sm.stopSession();
    }

    @Override
    public void rollback() {
        if (sm.getCurrentSession().getTransaction().isActive()) {
            sm.getCurrentSession().getTransaction().rollback();
        }

        sm.stopSession();
    }

    public EntityManager getEntityManager(){
        return sm.getCurrentSession();
    }
}
