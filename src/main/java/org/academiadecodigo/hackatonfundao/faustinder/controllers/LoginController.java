package org.academiadecodigo.hackatonfundao.faustinder.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.academiadecodigo.hackatonfundao.faustinder.utils.Security;

public class LoginController implements Controller {


        @FXML
        private TextField loginViewUsername;

        @FXML
        private PasswordField loginViewPassword;

        @FXML
        private Button loginViewButton;

        @Override
        public String getName() {
                return null;
        }

        public TextField getLoginViewUsername() {
                return loginViewUsername;
        }

        public String getLoginViewPassword() {
                return Security.getHash(loginViewPassword.getText());
        }

        public Button getLoginViewButton() {
                return loginViewButton;
        }


}

