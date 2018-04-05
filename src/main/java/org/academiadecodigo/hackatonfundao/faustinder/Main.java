package org.academiadecodigo.hackatonfundao.faustinder;

import javafx.application.Application;
import javafx.stage.Stage;
import org.academiadecodigo.hackatonfundao.faustinder.models.User;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.SessionManagerImpl;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.TransactionManager;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.TransactionManagerImpl;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.UserDao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        new Bootstrap().boot(primaryStage);
    }
}
