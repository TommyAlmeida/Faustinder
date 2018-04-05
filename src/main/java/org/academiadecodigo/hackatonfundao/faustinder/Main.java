package org.academiadecodigo.hackatonfundao.faustinder;

import javafx.application.Application;
import javafx.stage.Stage;
import org.academiadecodigo.hackatonfundao.faustinder.models.User;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.SessionManagerImpl;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.TransactionManagerImpl;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.UserDao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Instantiate the navigation singleton and set the stage
        Navigation navigation = Navigation.getInstance();
        navigation.setStage(primaryStage);

        // Load the login screen
       // navigation.loadScreen(InitialController.getName());

        // Render the UI
        primaryStage.setTitle("FausTinder");
        primaryStage.show();

        // TODO Tomás, arranja!
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("prod");
        SessionManagerImpl sessionManager = new SessionManagerImpl();
        TransactionManagerImpl transactionManager = new TransactionManagerImpl();

        transactionManager.setSessionManager(sessionManager);
        sessionManager.setEmf(emf);

        UserDao userDao = new UserDao();
        userDao.setTransactionManager(transactionManager);

        userDao.saveOrUpdate(new User( "Faustino", "faustinater"));

    }

    public static void main(String[] args) {

        launch(args);

    }
}
