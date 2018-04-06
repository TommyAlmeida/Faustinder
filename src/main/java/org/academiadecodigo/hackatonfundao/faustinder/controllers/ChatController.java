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
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import org.academiadecodigo.hackatonfundao.faustinder.models.User;
import org.academiadecodigo.hackatonfundao.faustinder.server.Server;

import java.io.File;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChatController implements Controller {

    private String otherUsername;
    private String myMessage;
    private String otherMessage;

    public void initialize() {
        scrollPane.vvalueProperty().bind(messagePane.heightProperty());

        textbox11.setText("");
        textbox12.setText("");
        textbox13.setText("");
        textbox14.setText("");
        textbox15.setText("");
        textbox16.setText("");
        textbox21.setText("");
        textbox22.setText("");
        textbox23.setText("");
        textbox24.setText("");
        textbox25.setText("");
        textbox26.setText("");


        messagepeople();
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
    private Label textbox11;

    @FXML
    private Label textbox26;

    @FXML
    private Label textbox25;

    @FXML
    private Label textbox24;

    @FXML
    private Label textbox23;

    @FXML
    private Label textbox22;

    @FXML
    private Label textbox21;

    @FXML
    private Label textbox16;

    @FXML
    private Label textbox15;

    @FXML
    private Label textbox14;

    @FXML
    private Label textbox13;

    @FXML
    private Label textbox12;

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

    }

    public void messagepeople() {

        messageToSend.setOnKeyPressed(new EventHandler<KeyEvent>() {
                                          @Override
                                          public void handle(KeyEvent keyEvent) {

                                              if (keyEvent.getCode() == KeyCode.ENTER) {
                                                  String text = messageToSend.getText();
                                                  System.out.println(text);
                                                  updateChatMine(text);

                                                  messageToSend.setText("");
                                                  messageToSend.requestFocus();
                                              }
                                          }

                                      }

        );
    }


    @Override
    public String getName() {
        return null;
    }

    private void printToBox() {
        for (int i = 0; i < 6; i++) {
            messagepeople();
            receiveMessage(botMessage(i));
        }

    }

    public void updateChatMine(String message) {
        textbox16.setText(textbox15.getText());
        textbox15.setText(textbox14.getText());
        textbox14.setText(textbox13.getText());
        textbox13.setText(textbox12.getText());
        textbox12.setText(textbox11.getText());
        textbox11.setText(message);
        textbox26.setText(textbox25.getText());
        textbox25.setText(textbox24.getText());
        textbox24.setText(textbox23.getText());
        textbox23.setText(textbox22.getText());
        textbox22.setText(textbox21.getText());
        textbox21.setText("");
    }

    public void receiveMessage(String message) {
        textbox16.setText(textbox15.getText());
        textbox15.setText(textbox14.getText());
        textbox14.setText(textbox13.getText());
        textbox13.setText(textbox12.getText());
        textbox12.setText(textbox11.getText());
        textbox11.setText("");
        textbox26.setText(textbox25.getText());
        textbox25.setText(textbox24.getText());
        textbox24.setText(textbox23.getText());
        textbox23.setText(textbox22.getText());
        textbox22.setText(textbox21.getText());
        textbox21.setText(message);
    }

    Server server;

    public void setServer(Server server) {
        this.server = server;
    }

    private String botMessage(int i) {
        switch (i) {
            case 0:
                return "Hello handsome!";

            case 1:
                return "How have you been???";

            case 2:
                return "Me tooooooooo! Wanna hook up?!";

            case 3:
                return "I'm into some very kinky stuff! I love taking care of my boys.....";

            case 4:
                return "You can even call me mommy!";

            case 5:
                return "Who's your mommy???";

        }

        return "";
    }

}





