package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;

public class SearchingMatchesController implements Controller {

    @FXML
    private Label searchingMatchesText;


    @FXML
    private ProgressIndicator progress;

    public void initialize() {
        progress.setProgress(0);
        try {
            Thread.sleep(200);

            progress.setProgress(20);
            Thread.sleep(150);
            progress.setProgress(55);
            Thread.sleep(200);
            progress.setProgress(80);
            Thread.sleep(250);
            progress.setProgress(100);
            Thread.sleep(100);

            Navigation.getInstance().loadScreen(Views.RESULTS_VIEW.getView());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getName() {
        return null;
    }
}

