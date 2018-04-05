package org.academiadecodigo.hackatonfundao.faustinder;

import org.academiadecodigo.hackatonfundao.faustinder.models.User;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.SessionManagerImpl;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.TransactionManager;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.TransactionManagerImpl;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.UserDao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("prod");

        SessionManagerImpl sessionManager = new SessionManagerImpl();
        TransactionManagerImpl transactionManager = new TransactionManagerImpl();

        transactionManager.setSessionManager(sessionManager);
        sessionManager.setEmf(emf);

        UserDao userDao = new UserDao();
        userDao.setTransactionManager(transactionManager);

        userDao.saveOrUpdate(new User( "Faustino", "faustinater"));

    }

}
