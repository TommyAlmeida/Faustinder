package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;
import org.academiadecodigo.hackatonfundao.faustinder.models.User;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
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
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());
    }


    public void loginAction(){
        User u = userService.findByUsername(loginViewUsername.getText());

        if(u == null){
            return;
        }

        Navigation.getInstance().loadScreen(Views.SEARCH_VIEW.getView());
    }

    @Override
    public String getName() {
        return NAME;
    }
}

