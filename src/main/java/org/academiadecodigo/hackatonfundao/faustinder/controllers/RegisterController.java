package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;

public class RegisterController implements Controller {


    @FXML
    private Label fetishSettingText;

    @FXML
    private CheckBox ponyPlay;

    @FXML
    private CheckBox shibari;

    @FXML
    private CheckBox sensoryDeprivation;

    @FXML
    private CheckBox waxPlay;

    @FXML
    private CheckBox sM;

    @FXML
    private CheckBox playParty;

    @FXML
    private CheckBox ageplay;

    @FXML
    private CheckBox munch;

    @FXML
    private CheckBox masterSlave;

    @FXML
    private CheckBox dungeonMaster;

    @FXML
    private CheckBox veganBukkake;

    @FXML
    private CheckBox shoeLicking;

    @FXML
    private CheckBox feeding;

    @FXML
    private CheckBox stomping;

    @FXML
    private CheckBox furry;

    @FXML
    private Button fetishDoneButton;

    @FXML
    private Label fetishMaxWarning;

    @Override
    public String getName() {
        return null;
    }

    public void doNext(ActionEvent actionEvent) {

        Navigation.getInstance().loadScreen(Views.FETISH_SELECTOR.getView());
    }

    public void doBack(ActionEvent actionEvent) {

        Navigation.getInstance().loadScreen(Views.INITIAL_VIEW.getView());
    }

}
