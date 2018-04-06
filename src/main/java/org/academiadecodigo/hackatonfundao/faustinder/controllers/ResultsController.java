package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;

public class ResultsController implements Controller {

    private UserServiceImpl userService;

    @FXML
    private Button backButtonResult;

    @FXML
    private ImageView photoResultOne;

    @FXML
    private Label usernameResultOne;

    @FXML
    private Label ageResultOne;

    @FXML
    private Label cityResultOne;

    @FXML
    private Label fetishResultOne;

    @FXML
    private Button connectResultOne;

    @FXML
    private ImageView photoResultTwo;

    @FXML
    private ImageView photoResultThree;

    @FXML
    private Label usernameResultTwo;

    @FXML
    private Label usernameResultThree;

    @FXML
    private Label ageResultTwo;

    @FXML
    private Label ageResultThree;

    @FXML
    private Label cityResultTwo;

    @FXML
    private Label cityResultThree;

    @FXML
    private Label fetishResultTwo;

    @FXML
    private Label fetishResultThree;

    @FXML
    private Button connectResultTwo;

    @FXML
    private Button connectResultThree;

    @FXML
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());
        backButtonResult.setVisible(false);
    }

    @Override
    public String getName() {
        return null;
    }

    public void goChat(ActionEvent actionEvent) {
        Navigation.getInstance().loadScreen(Views.CHAT_VIEW.getView());

    }
}

