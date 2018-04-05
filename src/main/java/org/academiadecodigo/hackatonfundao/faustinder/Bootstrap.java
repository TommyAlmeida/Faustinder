package org.academiadecodigo.hackatonfundao.faustinder;

import javafx.stage.Stage;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.SessionManagerImpl;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.TransactionManagerImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Bootstrap {


    public void boot(Stage primaryStage){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("prod");

        SessionManagerImpl sessionManager = new SessionManagerImpl();
        TransactionManagerImpl transactionManager = new TransactionManagerImpl();


        //Setup primary stage and set to navigation
        primaryStage.setTitle("Faustinder");
        Navigation.getInstance().setStage(primaryStage);

        Navigation.getInstance().loadScreen(Views.INITIAL_VIEW.getView());

        //Setup hibernate dependencies
        transactionManager.setSessionManager(sessionManager);
        sessionManager.setEmf(emf);
    }

}
