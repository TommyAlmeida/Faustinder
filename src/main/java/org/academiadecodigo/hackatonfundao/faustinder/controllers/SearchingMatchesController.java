package org.academiadecodigo.hackatonfundao.faustinder.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Navigation;
import org.academiadecodigo.hackatonfundao.faustinder.helpers.Views;

public class SearchingMatchesController implements Controller {

    @FXML
    private Label searchingMatchesText;




   @FXML

   private ProgressBar progress;

    public void initialize() {

        progress.setProgress(0);
        load();
    }

    @Override
    public String getName() {
        return null;
    }

    private void load(){
        try {

            load1();
            load2();
            load3();

            Navigation.getInstance().loadScreen(Views.RESULTS_VIEW.getView());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void load1() throws InterruptedException {
        Thread.sleep(2000);

        progress.setProgress(20);
        Thread.sleep(1050);
        progress.setProgress(55);
    }

    public void load2() throws InterruptedException {
        Thread.sleep(2000);
        progress.setProgress(80);
        Thread.sleep(2500);
    }

    public void load3() throws InterruptedException {
        progress.setProgress(100);
        Thread.sleep(1000);

    }
}

