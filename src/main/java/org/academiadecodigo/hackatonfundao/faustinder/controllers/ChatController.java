package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;

public class ChatController implements Controller {

    private UserServiceImpl userService;

    @FXML
    private Label chattingWithInfo;

    @FXML
    private ImageView chatRecipientPhoto;

    @FXML
    private AnchorPane chatPane;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private AnchorPane messagePane;

    @FXML
    private TextArea messageToSend;

    @FXML
    private Button sendButton;

    @FXML
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());
    }

    @Override
    public String getName() {
        return null;
    }
}



