package org.academiadecodigo.hackatonfundao.faustinder;

import javafx.stage.Stage;
import org.academiadecodigo.hackatonfundao.faustinder.controllers.Controller;
import org.academiadecodigo.hackatonfundao.faustinder.controllers.InitialController;
import org.academiadecodigo.hackatonfundao.faustinder.controllers.LoginController;
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
        primaryStage.setTitle("FausTinder");
        Navigation.getInstance().setStage(primaryStage);

        Navigation.getInstance().loadScreen(Views.CHAT_VIEW.getView());

        //Setup hibernate dependencies
        transactionManager.setSessionManager(sessionManager);
        sessionManager.setEmf(emf);

    }

}
