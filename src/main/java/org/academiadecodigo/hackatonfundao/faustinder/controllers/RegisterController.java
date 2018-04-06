package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;
import org.academiadecodigo.hackatonfundao.faustinder.models.User;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;

public class RegisterController implements Controller {

    private UserServiceImpl userService;

    @FXML
    private TextField usernameField;

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
    private Label passwordNotMatch;

    @FXML
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());
        passwordNotMatch.setText("");
    }

    @Override
    public String getName() {
        return null;
    }

    public void doNext(ActionEvent actionEvent) {
        User u = new User();

        if(!passwordConfirmationField.getText().equals(passwordField.getText())) {
            passwordNotMatch.setDisable(false);
            return;
        }

        u.setPassword(passwordField.getText());
        u.setCity(localizationField.getText());
        u.setUsername(usernameField.getText());


        userService.addUser(u);
        userService.setCurrentUser(u);

        Navigation.getInstance().loadScreen(Views.FETISH_SELECTOR.getView());
        System.out.println("User saved");
    }

    public void doBack(ActionEvent actionEvent) {
        Navigation.getInstance().loadScreen(Views.INITIAL_VIEW.getView());
    }


    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
}
