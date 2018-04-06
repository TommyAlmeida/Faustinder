package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import org.academiadecodigo.hackatonfundao.faustinder.models.Fetish;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.FetishDao;
import org.academiadecodigo.hackatonfundao.faustinder.services.ServiceRegistry;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserService;
import org.academiadecodigo.hackatonfundao.faustinder.services.UserServiceImpl;

public class SearchController implements Controller {

    private UserServiceImpl userService;
    private FetishDao fetishDao;


    @FXML
    private Button myProfileButton;


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
        ObservableList<Fetish> fetishList = FXCollections.observableArrayList();

        fetishList.addAll(fetishDao.all());

        searchFetish.setItems(fetishList);
    }

    public void doSearch(){

    }

    @Override
    public String getName() {
        return null;
    }

    public void setFetishDao(FetishDao fetishDao) {
        this.fetishDao = fetishDao;
    }
}



