package g58414.atlg3.bmr.view;

import g58414.atlg3.bmr.model.Genre;
import g58414.atlg3.bmr.model.LifeStyle;
import g58414.atlg3.bmr.model.Personne;
import g58414.atlg3.bmr.model.util.Observer;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BmrView implements Observer {
    private BmrInput data;
    private BmrOutput result;
    private Personne person = new Personne();
    private Stage primaryStage;
    private HBox hbox= new HBox();
    private VBox vbox=new VBox();


    public void start() throws Exception {

        data = new BmrInput();
        result = new BmrOutput();
        person.register(this);


        /*
         initMenu()
         initbuttons()
         */

        initMenu();

        vbox.getChildren().add(hbox);
        hbox.getChildren().add(data);
        hbox.getChildren().add(result);
        initButton();

        Scene scene = new Scene(vbox);

        primaryStage = new Stage();
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void update() {
        result.setTfdbmr(person.getMBR());
        result.setTfdcalories(person.getCalories());
    }
    private void initMenu(){
        Menu menu = new Menu("File");
        menu.getItems().add(new MenuItem("Exit"));

        MenuBar mbar = new MenuBar();
        mbar.getMenus().add(menu);

        menu.setOnAction((ActionEvent event) -> {
            Platform.exit();
        });
        vbox.getChildren().add(mbar);
    }
    private void initButton(){
        Button btnCalcul = new Button("Calculer");
        vbox.getChildren().add(btnCalcul);

        Button btnClear = new Button("Clear");
        vbox.getChildren().add(btnClear);

        btnCalcul.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {


                try {
                    int age = data.getAge();
                    int height = data.getTaille();
                    int weight = data.getPoids();
                    Genre genre = data.getGenre();
                    LifeStyle life = data.getLifeStyle();

                    if (weight == 0 || height == 0 || age == 0) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("MBR errors");
                        alert.setContentText("the information must be positive");
                        alert.showAndWait();
                    } else {
                        person.setValues (height, height, age, genre, life);

                    }
                } catch (IllegalArgumentException e) {
                    result.Failed();
                }
            }

        });
        btnClear.setOnMousePressed((MouseEvent t) -> {
            data.clear();
            result.clear();
        });
    }
}
