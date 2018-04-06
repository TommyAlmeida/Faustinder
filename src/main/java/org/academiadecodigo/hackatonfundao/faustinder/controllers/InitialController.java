package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;

public class InitialController implements Controller {

    private UserServiceImpl userService;

    @FXML
    private Button initialRegisterButton;

    @FXML
    private Button initialLoginButton;

    @FXML
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());
    }

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


