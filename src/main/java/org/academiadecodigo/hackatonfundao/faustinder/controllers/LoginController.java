package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;

public class LoginController implements Controller {

    private static final String NAME = "LoginView";

    @FXML
    private TextField loginViewUsername;

    @FXML
    private PasswordField loginViewPassword;

    @FXML
    private Button loginViewButton;

    @Override
    public String getName() {
        return NAME;
    }

    @FXML
    void doLogin(ActionEvent event) {
        Navigation.getInstance().loadScreen(Views.SEARCH_VIEW.getView());
    }
}

