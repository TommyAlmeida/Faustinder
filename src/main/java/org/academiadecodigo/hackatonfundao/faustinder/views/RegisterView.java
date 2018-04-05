package org.academiadecodigo.hackatonfundao.faustinder.views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterView implements View {


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
    private ChoiceBox<?> ageField;

    @FXML
    private Button registerNextButton;


}
