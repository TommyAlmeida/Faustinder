package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;

public class SearchingMatchesController implements Controller {

    private UserServiceImpl userService;

    @FXML
    private Label searchingMatchesText;

    @FXML
    private ProgressBar progressBar;

    @FXML
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());
    }

    @Override
    public String getName() {
        return null;
    }
}

