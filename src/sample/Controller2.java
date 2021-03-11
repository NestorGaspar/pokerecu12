package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.Optional;
import java.util.Random;

public class Controller2 {

    private Controller1 Controller1; //Variable que contiene lo de la ventana1
    Controller2 Controller2;

    // Botones
    @FXML
    private Button curar1;

    @FXML
    private Button curar2;

    @FXML
    private Button curar3;

    @FXML
    private Button curar4;

    @FXML
    private Button Cerrar;

    @FXML
    private void onButtonCerrarVentana(ActionEvent event) {
        Stage stage = (Stage) Cerrar.getScene().getWindow();
        stage.close();
    }
    public void setVentana1(Controller1 ventana1){
        Controller1 = ventana1;
    }
}

