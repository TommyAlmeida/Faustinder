package org.academiadecodigo.hackatonfundao.faustinder.persistence.dao;

import org.academiadecodigo.hackatonfundao.faustinder.persistence.TransactionException;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.TransactionManagerImpl;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class GenericDao<T> implements Crud<T> {

    private TransactionManagerImpl transactionManager;
    private Class<T> modelType;

    public GenericDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    @Override
    public T find(String columnLabel){
        transactionManager.beginRead();
        EntityManager em = transactionManager.getEntityManager();
        return em.find(modelType, columnLabel);
    }

    @Override
    public T saveOrUpdate(T model) {
        transactionManager.beginWrite();

        EntityManager em = transactionManager.getEntityManager();
        T modelSaved;

        modelSaved = em.merge(model);

        if(modelSaved == null){
            transactionManager.rollback();
            throw new TransactionException("Something went wrong, the information wasn't save. Please try again.");
        }

        transactionManager.commit();
        return modelSaved;
    }

    @Override
    public List<T> all() {
        transactionManager.beginRead();
        EntityManager em = transactionManager.getEntityManager();

        //TODO: could in case of error, query malformed
        return em.createQuery("from" + modelType.getSimpleName(), modelType).getResultList();
    }

    @Override
    public T findBy(String columnLabel, Object by) {
        transactionManager.beginRead();
        EntityManager em = transactionManager.getEntityManager();
        return (T) em.createQuery("from " + modelType.getSimpleName() +  "where " + columnLabel + " =: " + columnLabel)
                .setParameter(columnLabel, "abc").getSingleResult();
    }

    @Override
    public void delete(T model) {
        transactionManager.beginWrite();
        EntityManager em = transactionManager.getEntityManager();
        em.remove(model);
        transactionManager.commit();
    }

    public void setTransactionManager(TransactionManagerImpl transactionManager) {
        this.transactionManager = transactionManager;
    }
}
