package g58414.atlg3.bmr.view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * output for the user
 */
public class BmrOutput extends GridPane {
    private TextField tfdbmr;
    private TextField tfdcalories;

    /**
     * constructor of output
     */
    public BmrOutput(){
        Titre();
        initBmr();
        initCalories();
    }

    /**
     * initialize the title of the output
     */
    public void Titre(){
        Label result = new Label("resultats");
        result.setUnderline(true);
        this.add(result, 0, 0);
    }

    /**
     * initialize the bmr.
     */
    private void initBmr () {
        Label bmr = new Label("BMR : ");
        tfdbmr = new TextField();
        tfdbmr.setPrefColumnCount(20);
        this.add(bmr, 0, 1);
        this.add(tfdbmr, 1, 1);
        consume(tfdbmr);
    }

    /**
     * initializes the text field of the calories
     */
    private void initCalories () {
        Label calories = new Label("Calories : ");
        tfdcalories = new TextField();
        tfdcalories.setPrefColumnCount(20);
        this.add(calories, 0, 2);
        this.add(tfdcalories, 1, 2);
        consume(tfdcalories);
    }

    /**
     * setter for the bmr
     * @param mbr
     */
    public void setTfdbmr(double mbr) {
        tfdbmr.setText(Double.toString(mbr));
    }

    /**
     * setter for the calories
     * @param calories
     */
    public void setTfdcalories(double calories){
        tfdcalories.setText(Double.toString(calories));
    }

    /**
     * consumes the letters from the text field and allows only numbers
     * @param tfd
     */
    private static void consume(TextField tfd){
        tfd.addEventFilter(KeyEvent.KEY_TYPED,(KeyEvent event) -> {
            char c = event.getCharacter().charAt(0);
            event.consume();
        });
    }

    /**
     * clear the outputs
     */
    public void clear(){
        tfdbmr.clear();
        tfdcalories.clear();
    }

    /**
     * sets a message if the inputs are wrong
     */
    public void Failed(){ // les noms des méthodes commencent par une minuscule.
        tfdbmr.setText("Failed!");
        tfdbmr.setStyle("-fx-text-fill: red;");
        tfdcalories.setText("Failed!");
        tfdcalories.setStyle("-fx-text-fill: red;");
    }
}
