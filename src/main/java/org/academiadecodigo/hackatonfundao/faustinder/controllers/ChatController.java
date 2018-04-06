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
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;
import org.academiadecodigo.hackatonfundao.faustinder.server.Server;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChatController implements Controller {

    public Button backButton;
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
        backButton.setText("Exit");


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
                                                  messageToSend.setText("");
                                                  messageToSend.requestFocus();
                                                  delay();
                                                  receiveMessage(botMessage());



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

        textbox21.setText(message);

    }

    private void delay(){
        receivingMessage("Gimp is writing...");
System.gc();
        for (int i = 0; i < 99; i++) {
            receiveMessage("Gimp is writing...");
            System.gc();
                System.out.println(i);

                        receiveMessage("Gimp is writing...");



        }
    }

    public void receivingMessage(String message) {
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
      // botMessages.add(". . .");

        botMessages.add("Hello there my kinky friend!!, I'm Gimp, and\n I'm here to be your PIMP!!!");
        //botMessages.add(". . .");
        botMessages.add("Girl, you don't really know what's like to be \n dominated until you're B#tch!");
        //botMessages.add(". . .");
        botMessages.add("Yeah OK... Wanna hook up?! Show boobs!!");
        botMessages.add("Oh... Come on... I'm into some very kinky \n" +
                "stuff! I love taking care of my b#tches.....");
        botMessages.add("You can even call me Daddy!");
        botMessages.add("Who's your DADDY???");

    }

    private String botMessage() {
        String temp = botMessages.get(0);
        botMessages.remove(0);
        return temp;
    }

    public void goBack(ActionEvent actionEvent) {
        Navigation.getInstance().loadScreen(Views.FETISH_EDITOR.getView());
    }
}





