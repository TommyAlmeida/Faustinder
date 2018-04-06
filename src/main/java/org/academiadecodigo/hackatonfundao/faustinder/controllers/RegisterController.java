package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

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
}
