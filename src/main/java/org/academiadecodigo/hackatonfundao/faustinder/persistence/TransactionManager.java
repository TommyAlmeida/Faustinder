package org.academiadecodigo.hackatonfundao.faustinder.persistence;

public interface TransactionManager {

    /**
     * Start's a new session {@see SessionManager}
     */
    void beginRead();

    /**
     * Start's a new transaction
     */
    void beginWrite();

    /**
     * Commit changes to the database
     */
    void commit();

    /**
     * Rollback the current transaction
     */
    void rollback();

}
