module com.example.bmrg58414 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens g58414.atlg3.bmr to javafx.fxml;
    exports g58414.atlg3.bmr.view;
    exports g58414.atlg3.bmr.model;
    exports g58414.atlg3.bmr.controller;
    exports g58414.atlg3.bmr.model.util;
}