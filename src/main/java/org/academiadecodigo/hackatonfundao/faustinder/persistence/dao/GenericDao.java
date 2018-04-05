package org.academiadecodigo.hackatonfundao.faustinder.persistence.dao;

import org.academiadecodigo.hackatonfundao.faustinder.persistence.TransactionManagerImpl;

public abstract class GenericDao<T> {

    private TransactionManagerImpl transactionManager;
    private Class<T> modelType;

    public GenericDao(Class<T> modelType) {
        this.modelType = modelType;
    }


}
