package org.academiadecodigo.hackatonfundao.faustinder;

import javafx.stage.Stage;
import org.academiadecodigo.hackatonfundao.faustinder.controllers.Controller;
import org.academiadecodigo.hackatonfundao.faustinder.controllers.InitialController;
import org.academiadecodigo.hackatonfundao.faustinder.controllers.LoginController;
import org.academiadecodigo.hackatonfundao.faustinder.controllers.RegisterController;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;
import org.academiadecodigo.hackatonfundao.faustinder.models.User;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.SessionManagerImpl;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.TransactionManagerImpl;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.FetishDao;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.UserDao;
import org.academiadecodigo.hackatonfundao.faustinder.services.Service;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Bootstrap {


    public void boot(Stage primaryStage){


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("prod");

        SessionManagerImpl sessionManager = new SessionManagerImpl();
        TransactionManagerImpl transactionManager = new TransactionManagerImpl();

        UserServiceImpl service = new UserServiceImpl();
        ServiceRegistry.getInstance().add(UserService.class.getSimpleName(), service);

        UserDao userDao = new UserDao();
        userDao.setTransactionManager(transactionManager);

        service.setUserDao(userDao);

        FetishDao fetishDao = new FetishDao();
        fetishDao.setTransactionManager(transactionManager);
        service.setFetishDao(fetishDao);

        //Setup primary stage and set to navigation
        primaryStage.setTitle("FausTinder");
        Navigation.getInstance().setStage(primaryStage);

        Navigation.getInstance().loadScreen("editprofileview.fxml");

        //Setup hibernate dependencies
        transactionManager.setSessionManager(sessionManager);
        sessionManager.setEmf(emf);




    }

}
