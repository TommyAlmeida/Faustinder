package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.TextAlignment;
import org.academiadecodigo.hackatonfundao.faustinder.models.User;

import java.io.File;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChatController implements Controller {

    public void initialize() {
        scrollPane.vvalueProperty().bind(messagePane.heightProperty());
    }

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
    void sendMessageEnter(KeyEvent event) {

    }

    @FXML
    void sendMessageMouse(ActionEvent event) {
        messagepeople();
    }

    public void messagepeople() {
        messageToSend.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    String text = messageToSend.getText();
                    System.out.println(text);
                    // do your thing...
                    // clear text
                    messageToSend.setText("");
                    messageToSend.requestFocus();
                }
            }
        });
    }


    @Override
    public String getName() {
        return null;
    }



}



