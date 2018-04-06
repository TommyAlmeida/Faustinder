package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;

public class InitialController implements Controller {

    private Navigation navigation;

    @FXML
    private Button initialRegisterButton;

    @FXML
    private Button initialLoginButton;

    @Override
    public String getName() {
        return null;
    }

    public void doLogin(ActionEvent actionEvent) {
        Navigation.getInstance().loadScreen(Views.LOGIN_VIEW.getView());
    }

    public void doRegister(ActionEvent actionEvent){
        Navigation.getInstance().loadScreen(Views.REGISTER_VIEW.getView());
    }
}


