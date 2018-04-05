package org.academiadecodigo.hackatonfundao.faustinder.persistence;

import javax.persistence.EntityManager;

public interface SessionManager {

    /**
     * Creates a new entity manager
     */
    void startSession();

    /**
     * Close the session
     */
    void stopSession();

    EntityManager getCurrentSession();
}
