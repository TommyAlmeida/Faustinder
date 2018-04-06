package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;


public class FetishEditor implements Controller {

    private UserServiceImpl userService;

    @FXML
    private Label fetishSettingText;

    @FXML
    private Button fetishDoneButton;

    @FXML
    private CheckBox fetish1;

    @FXML
    private CheckBox fetish2;

    @FXML
    private CheckBox fetish3;

    @FXML
    private Label fetishMaxWarning;

    @FXML
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());
    }

    @Override
    public String getName() {
        return null;
    }
}

