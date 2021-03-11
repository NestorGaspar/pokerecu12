package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Controller1 {

    @FXML
    private VBox vbox1;
    @FXML
    private Label labelNombre1;
    @FXML
    private Label labelNivel1;
    @FXML
    private Label labelVida1;
    @FXML
    private ProgressBar progressbar1;
    @FXML
    private ImageView image1;
    @FXML
    private VBox vbox2;
    @FXML
    private Label labelNombre2;
    @FXML
    private Label labelNivel2;
    @FXML
    private Label labelVida2;
    @FXML
    private ProgressBar progressbar2;
    @FXML
    private ImageView image2;
    @FXML
    private VBox vbox3;
    @FXML
    private Label labelNombre3;
    @FXML
    private Label labelNivel3;
    @FXML
    private Label labelVida3;
    @FXML
    private ProgressBar progressbar3;
    @FXML
    private ImageView image3;
    @FXML
    private VBox vbox4;
    @FXML
    private Label labelNombre4;
    @FXML
    private Label labelNivel4;
    @FXML
    private Label labelVida4;
    @FXML
    private ProgressBar progressbar4;
    @FXML
    private ImageView image4;
    @FXML
    private VBox vbox5;
    @FXML
    private Label labelNombre5;
    @FXML
    private Label labelNivel5;
    @FXML
    private Label labelVida5;
    @FXML
    private ProgressBar progressbar5;
    @FXML
    private ImageView image5;
    @FXML
    private VBox vbox6;
    @FXML
    private Label labelNombre6;
    @FXML
    private Label labelNivel6;
    @FXML
    private Label labelVida6;
    @FXML
    private ProgressBar progressbar6;
    @FXML
    private ImageView image6;
    @FXML
    private Button Mochila;
    @FXML
    private Button Salir;
    @FXML
    private GridPane gridPane;


    // Valores de cada Pokémon:
    Pokemon pokemon1 = new Pokemon("Squir", "Nv 65", 400,200);
    Pokemon pokemon2 = new Pokemon("Bulba", "Nv 45", 400,200);
    Pokemon pokemon3 = new Pokemon("Charmander", "Nv 55", 400, 200);
    Pokemon pokemon4 = new Pokemon("Pikachu", "Nv 65", 400, 200);
    Pokemon pokemon5 = new Pokemon("Eevee", "Nv 75", 400, 200);
    Pokemon pokemon6 = new Pokemon("Butterfree", "Nv 55", 400, 200);
    Pokemon miPokemon;   // Pokemon para las curas:

    @FXML
    public void initialize() {
        Binder.bind(pokemon1, labelNombre1, labelNivel1, labelVida1, progressbar1, image1);
        Binder.bind(pokemon2, labelNombre2, labelNivel2, labelVida2, progressbar2, image2);
        Binder.bind(pokemon3, labelNombre3, labelNivel3, labelVida3, progressbar3, image3);
        Binder.bind(pokemon4, labelNombre4, labelNivel4, labelVida4, progressbar4, image4);
        Binder.bind(pokemon5, labelNombre5, labelNivel5, labelVida5, progressbar5, image5);
        Binder.bind(pokemon6, labelNombre6, labelNivel6, labelVida6, progressbar6, image6);

        Salir.setDisable(false);
        Mochila.setDisable(true);
    }


    public void pokemonSelected(VBox vbox, Label nombre, Label nivel, Label vida) {
        quitarSelected();
        vbox.setStyle("-fx-background-color: #C4DF91; -fx-border-color: black; -fx-border-width: 2");
        nombre.setTextFill(Color.BLACK);
        nivel.setTextFill(Color.BLACK);
        vida.setTextFill(Color.BLACK);
        Mochila.setDisable(false);
        Salir.setDisable(false);
        Mochila.setText("Mochila");
    }


    public void pokemonNoSelected(VBox vbox, Label nombre, Label nivel, Label vida) {
        vbox.setStyle("-fx-background-color:   #72E874; -fx-border-color:  black; -fx-border-width: 2");
        nombre.setTextFill(Color.WHITE);
        nivel.setTextFill(Color.WHITE);
        vida.setTextFill(Color.WHITE);
        Salir.setDisable(false);
        Mochila.setDisable(true);
        Mochila.setText("Siguiente");
    }

    public void quitarSelected() {
        pokemonNoSelected(vbox1, labelNombre1, labelNivel1, labelVida1);
        pokemonNoSelected(vbox2, labelNombre2, labelNivel2, labelVida2);
        pokemonNoSelected(vbox3, labelNombre3, labelNivel3, labelVida3);
        pokemonNoSelected(vbox4, labelNombre4, labelNivel4, labelVida4);
        pokemonNoSelected(vbox5, labelNombre5, labelNivel5, labelVida5);
        pokemonNoSelected(vbox6, labelNombre6, labelNivel6, labelVida6);
    }

    public void onClickExit() {
        gridPane.setStyle("-fx-background-color:   green");
        pokemonNoSelected(vbox1, labelNombre1, labelNivel1, labelVida1);
        pokemonNoSelected(vbox2, labelNombre2, labelNivel2, labelVida2);
        pokemonNoSelected(vbox3, labelNombre3, labelNivel3, labelVida3);
        pokemonNoSelected(vbox4, labelNombre4, labelNivel4, labelVida4);
        pokemonNoSelected(vbox5, labelNombre5, labelNivel5, labelVida5);
        pokemonNoSelected(vbox6, labelNombre6, labelNivel6, labelVida6);
    }

    @FXML
    public void onClickPokemon(MouseEvent mouseEvent) {
        String source2 = mouseEvent.getPickResult().getIntersectedNode().getId(); //
        System.out.println(source2);

        if (source2 != null ) {
            switch (source2) {
                case ("image1") : {
                    pokemonSelected(vbox1, labelNombre1, labelNivel1, labelVida1);
                }
                break;
                case "image2" : {
                    pokemonSelected(vbox2, labelNombre2, labelNivel2, labelVida2);
                }
                break;
                case "image3" : {
                    pokemonSelected(vbox3, labelNombre3, labelNivel3, labelVida3);
                }
                break;
                case "image4" : {
                    pokemonSelected(vbox4, labelNombre4, labelNivel4, labelVida4);
                }
                break;
                case "image5" : {
                    pokemonSelected(vbox5, labelNombre5, labelNivel5, labelVida5);
                }
                break;
                case "image6" : {
                    pokemonSelected(vbox6, labelNombre6, labelNivel6, labelVida6);
                }
                break;
            }
        }
    }



    @FXML
    private void onButtonNextClicked(MouseEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample2.fxml"));
            GridPane root = (GridPane) loader.load();
            Scene scene = new Scene(root,650,450);
            stage.setScene(scene);
            stage.show();

            Controller2 controller = loader.getController();
            controller.setVentana1(this);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }



}
