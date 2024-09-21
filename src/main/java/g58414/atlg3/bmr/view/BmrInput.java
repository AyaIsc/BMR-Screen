package g58414.atlg3.bmr.view;

import g58414.atlg3.bmr.model.Genre;
import javafx.collections.FXCollections;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import g58414.atlg3.bmr.model.LifeStyle;
import g58414.atlg3.bmr.view.BmrView;

/**
 * class for the inputs from the user.
 */
public class BmrInput extends GridPane{
    public BmrInput() {
        initTitre();
        initTailleField();
        initAgeField();
        initGenreField();
        initPoidsField();
        initList();
        initGSelected();
    }


        private TextField tfdtaille;
        private TextField tfdpoids;

        private TextField tfdage;

        private RadioButton sexeF ;
        private RadioButton sexeM ;

        private ChoiceBox<LifeStyle> lifeStyles ;

        //private BmrOutput output;

    /**
     * initialize the title 
     */
    private void initTitre () {
            Label data = new Label("Données");
            data.setUnderline(true);
            this.add(data, 0, 0);
        }

    /**
     * initializes the height.
     */
    private void initTailleField () {
            Label taille = new Label("Taille (cm)");
            tfdtaille = new TextField();
            tfdtaille.setPrefColumnCount(20); //verif si taille inf à 0
            this.add(taille, 0, 1);
            this.add(tfdtaille, 1, 1);
            consumeLetter(tfdtaille);
        }

    /**
     * getter for the height
     * @return
     */
    public int getTaille () {
            if (tfdtaille.getText().isEmpty()) {
                throw new IllegalArgumentException("height not valid");
            }
            return Integer.parseInt(tfdtaille.getText());
        }

    /**
     * initialize the user's weight
     */
    private void initPoidsField () {
            Label poids = new Label("Poids (kgs)");
            tfdpoids = new TextField();
            tfdpoids.setPrefColumnCount(20);
            this.add(poids, 0, 2);
            this.add(tfdpoids, 1, 2);
            consumeLetter(tfdpoids);

        }

    /**
     * getter for the user's weight
     * @return
     */
    public int getPoids () {
            if (tfdpoids.getText().isEmpty()) {
                throw new IllegalArgumentException("height not valid");
            }
            return Integer.parseInt(tfdpoids.getText());
        }

    /**
     * initialize the field of the user's age
     */
    private void initAgeField () {
            Label age = new Label("age (années)");
            tfdage = new TextField();
            tfdage.setPrefColumnCount(20);
            this.add(age, 0, 3);
            this.add(tfdage, 1, 3);
            consumeLetter(tfdage);
        }

    /**
     * getter for the age 
     * @return int of the age
     */
    public int getAge () {
            if (tfdage.getText().isEmpty()) {
                throw new IllegalArgumentException("height not valid");
            }
            return Integer.parseInt((tfdage.getText()));
        }

    /**
     * initialization of the field sex
     */
    private void initGenreField () {
            Label genre = new Label("sexe");
            sexeF = new RadioButton("Femme");
            sexeM = new RadioButton("Homme");
            this.add(genre, 0, 4);
            this.add(sexeF, 1, 4);
            this.add(sexeM, 2, 4);
        }

    /**
     * getter for the user's sex
     * @return
     */
    public Genre getGenre(){
            return sexeF.isSelected()? Genre.FEMME : Genre.HOMME;
        }

    /**
     * initialize the selection of sex with the toggle group.
     */
    private void initGSelected(){
            ToggleGroup grp=new ToggleGroup();
            sexeF.setToggleGroup(grp);
            sexeM.setToggleGroup(grp);
        }

    /**
     * initialize the list of life styles
     */
    private void initList(){
            Label lifeStyle =new Label ("Style de vie");
            lifeStyles = new ChoiceBox(FXCollections.observableArrayList(LifeStyle.values()));
            this.add(lifeStyle,0,5);
            this.add(lifeStyles,1,5);
        }

    /**
     * getter for the life style.
     * @return  life Style
     */
    public LifeStyle getLifeStyle(){
            return lifeStyles.getValue();
        }

    /**
     * method that consumes letters on the input so the user can put only numbers
     * @param tfd
     */
    private static void consumeLetter(TextField tfd){
        tfd.addEventFilter(KeyEvent.KEY_TYPED,(KeyEvent event) -> {
            char c = event.getCharacter().charAt(0);
            if(!Character.isDigit(c)) {
                event.consume();
            }
        });
    }

    /**
     * Button to clear the input zones
     */
    public void clear(){
        tfdpoids.clear();
        tfdage.clear();
        tfdtaille.clear();
        lifeStyles.getSelectionModel().clearSelection();
        sexeF.selectedProperty().setValue(false);
        sexeM.selectedProperty().setValue(false);
    }
}
