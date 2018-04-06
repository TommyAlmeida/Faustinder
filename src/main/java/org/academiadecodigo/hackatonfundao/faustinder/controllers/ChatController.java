package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import org.academiadecodigo.hackatonfundao.faustinder.server.Server;

import java.util.LinkedList;
import java.util.List;

public class ChatController implements Controller {

    private String otherUsername;
    private String myMessage;
    private String otherMessage;

    public ChatController() {
    }

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

        populateBotMessages();


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
                                                  receiveMessage(botMessage());

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

    List<String> botMessages = new LinkedList<>();

    private void populateBotMessages() {
        botMessages.add("Hello handsome!");
        botMessages.add("How have you been?!");
        botMessages.add("Me tooooooooo! Wanna hook up?!");
        botMessages.add("I'm into some very kinky stuff! I love taking \ncare of my boys.....");
        botMessages.add("You can even call me mommy!");
        botMessages.add("Who's your mommy???");

    }

    private String botMessage() {
        String temp = botMessages.get(0);
        botMessages.remove(0);
        return temp;
    }

}





