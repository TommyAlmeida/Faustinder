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

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    private int maxSelected;

    private List<CheckBox> checkboxList;


    @FXML
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());
        maxSelected = 3;
        checkboxList = new ArrayList<>();
        setupCheckboxes();
    }

    public void doRegister(ActionEvent actionEvent) {
        int slots = 0;

        for(CheckBox cb : checkboxList){
            if(cb.isSelected()){
                slots++;
            }

            if(slots <= 3){
                Navigation.getInstance().loadScreen(Views.SEARCH_VIEW.getView());
                return;
            }
        }


    }

    private void setupCheckboxes() {
        configureCheckBox(ponyPlay);
        configureCheckBox(playParty);
        configureCheckBox(waxPlay);
        configureCheckBox(ageplay);
        configureCheckBox(shibari);
        configureCheckBox(munch);
        configureCheckBox(masterSlave);
        configureCheckBox(dungeonMaster);
        configureCheckBox(veganBukkake);
        configureCheckBox(shoeLicking);
        configureCheckBox(feeding);
        configureCheckBox(stomping);
        configureCheckBox(furry);
        configureCheckBox(sensoryDeprivation);
        configureCheckBox(sM);
    }

    private void configureCheckBox(CheckBox checkBox) {
        checkboxList.add(checkBox);
    }

    @Override
    public String getName() {
        return null;
    }
}


