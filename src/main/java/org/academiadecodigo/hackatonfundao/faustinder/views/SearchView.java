package org.academiadecodigo.hackatonfundao.faustinder.views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class SearchView implements View {


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

}



