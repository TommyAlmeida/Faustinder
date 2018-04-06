package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;

public class FetishSelectorController implements Controller {

    private UserServiceImpl userService;

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

    @FXML
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());
    }

    @Override
    public String getName() {
        return null;
    }



    // TODO: create screen


    public void doRegister(ActionEvent actionEvent) {
    }
}


