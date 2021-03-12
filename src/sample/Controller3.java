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

public class Controller3 {

    private Controller1 Controller1; //Variable que contiene lo de la ventana1
    Controller3 Controller3;

    public void setVentana1(Controller1 ventana1){
        Controller1 = ventana1;
    }
}