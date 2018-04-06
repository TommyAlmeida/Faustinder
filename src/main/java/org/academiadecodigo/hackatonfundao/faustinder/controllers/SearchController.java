package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;
import org.academiadecodigo.hackatonfundao.faustinder.models.Fetish;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.FetishDao;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;

public class SearchController implements Controller {



    private UserServiceImpl userService;
    private FetishDao fetishDao;
    private String username;


    @FXML
    private Button logoutButton;

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
    private Label searchParametersQuestion;

    @FXML
    private Button searchButton;


    @FXML
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());


        ObservableList<Fetish> fetishList = FXCollections.observableArrayList();

        //For each fetish on the service, add to fetich list ^
        for( Fetish fetish : fetishList){
            fetishList.add(fetishDao.findByFetish(fetish));
        }

    }



    public void doSearch(){

        Navigation.getInstance().loadScreen(Views.RESULTS_VIEW.getView());

    }

    @Override
    public String getName() {
        return null;
    }

    public void setFetishDao(FetishDao fetishDao) {
        this.fetishDao = fetishDao;
    }

    public void goLogout(ActionEvent actionEvent) {
        Navigation.getInstance().loadScreen(Views.INITIAL_VIEW.getView());
    }
}



