package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;

public class RegisterController implements Controller {

    @FXML
    private Label passwordNotMatch;

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField localizationField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField passwordConfirmationField;

    @FXML
    private ChoiceBox<?> genderField;

    @FXML
    private Button registerNextButton;

    @FXML
    private DatePicker birthDateSelector;


    @Override
    public String getName() {
        return null;
    }

    public void doNext(ActionEvent actionEvent) {
        Navigation.getInstance().loadScreen(Views.FETISH_SELECTOR.getView());
    }

    public void doBack(ActionEvent actionEvent) {

        Navigation.getInstance().loadScreen(Views.INITIAL_VIEW.getView());
    }



}
