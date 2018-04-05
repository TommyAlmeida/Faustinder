package org.academiadecodigo.hackatonfundao.faustinder.persistence.dao;

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
        EntityManager em = transactionManager.getEntityManager();

        return em.find(modelType, columnLabel);
    }

    @Override
    public T saveOrUpdate(T model) {
        return null;
    }

    @Override
    public List<T> all() {
        return null;
    }

    @Override
    public void delete(T model) {

    }

    public void setTransactionManager(TransactionManagerImpl transactionManager) {
        this.transactionManager = transactionManager;
    }
}
