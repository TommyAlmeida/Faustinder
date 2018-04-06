package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    public Label searchParametersQuestion;

    @FXML
    private Button logoutButton;


    @FXML
    private Label welcomeMessage;

    @FXML
    private Label fetishDefiningQuestion;

    @FXML
    private ChoiceBox<Fetish> searchFetish;

    @FXML
    private Button searchButton;


    @FXML
    public void initialize() {
        userService = (UserServiceImpl) ServiceRegistry.getInstance().get(UserService.class.getSimpleName());

        welcomeMessage.setText("Welcome!");

        ObservableList<Fetish> fetishList = FXCollections.observableArrayList();

        //For each fetish on the service, add to fetich list ^
        for( Fetish fetish : fetishList){
            fetishList.add(fetishDao.findByFetish(fetish));
        }

        searchFetish.setItems(fetishList);
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



