package g58414.atlg3.bmr.controller;

import g58414.atlg3.bmr.view.BmrView;
import javafx.application.Application;
import javafx.stage.Stage;


public class Bmr extends Application {

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage primaryStage) throws Exception {

        BmrView view = new BmrView();
        view.start();
    }

}
