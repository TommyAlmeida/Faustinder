package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;

public class SearchController implements Controller {

    private UserServiceImpl userService;


    @FXML
    private Button myProfileButton;

    @FXML
    private Label welcomeMessage;

    @FXML
    private Label searchParametersQuestion;

    @FXML
    private Label genderDefiningQuestion;

    @FXML
    private ChoiceBox<?> searchGenderPreference;

    @FXML
    private Label ageDefiningQuestion;

    @FXML
    private ChoiceBox<?> ageCityPreference;

    @FXML
    private Label fetishDefiningQuestion;

    @FXML
    private Label cityDefiningQuestion;

    @FXML
    private ChoiceBox<?> searchCityPreference;

    @FXML
    private Button searchButton;

    @FXML
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());
    }

    @Override
    public String getName() {
        return null;
    }
}



