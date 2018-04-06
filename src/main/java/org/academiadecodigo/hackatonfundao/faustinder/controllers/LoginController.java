package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;

public class LoginController implements Controller {

    private UserServiceImpl userService;

    private static final String NAME = "LoginView";


    @FXML
    private TextField loginViewUsername;

    @FXML
    private PasswordField loginViewPassword;

    @FXML
    private Button loginViewButton;

    @FXML
    private Label flashyText;


    @FXML
    void doLogin(ActionEvent event) {
        System.out.println("login button");
        Navigation.getInstance().loadScreen(Views.SEARCH_VIEW.getView());

    }

    public void initialize() {
        flashyText.setVisible(false);
        flashyText.setText("");
        System.out.println("initialize");
    }

    @Override
    public String getName() {
        return NAME;
    }
}

