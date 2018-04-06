package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;


public class FetishEditor implements Controller {

    private UserServiceImpl userService;

    @FXML
    private Button yes;

    @FXML
    private Button no;



    @FXML
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());
    }

    @FXML
    void clickno(ActionEvent event) {
        Navigation.getInstance().loadScreen(Views.INITIAL_VIEW.getView());

    }

    @FXML
    void clickyes(ActionEvent event) {
    System.exit(0);
    }

    @Override
    public String getName() {
        return null;
    }
}

