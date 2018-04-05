package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import org.academiadecodigo.hackatonfundao.faustinder.views.View;


public class FetishEditor implements Controller {

    @FXML
    private Label fetishSettingText;

    @FXML
    private Button fetishDoneButton;

    @FXML
    private CheckBox fetish1;

    @FXML
    private CheckBox fetish2;

    @FXML
    private CheckBox fetish3;

    @FXML
    private Label fetishMaxWarning;

    @Override
    public String getName() {
        return null;
    }
}

