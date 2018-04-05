package org.academiadecodigo.hackatonfundao.faustinder;

import javafx.application.Application;
import javafx.stage.Stage;
import org.academiadecodigo.hackatonfundao.faustinder.controllers.InitialController;

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
    }

    public static void main(String[] args) {

        launch(args);

    }
}
