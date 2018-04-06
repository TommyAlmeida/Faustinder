package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;

public class SearchController implements Controller {


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
    void doSearch(ActionEvent event) {
        Navigation.getInstance().loadScreen(Views.SEARCHING_MATCHES.getView());
    }

    @Override
    public String getName() {
        return null;
    }
}



