package sample;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;

public class Binder {

    public static void bind(Pokemon pokemon, Label labelNombre, Label labelNivel, Label labelVida, ProgressBar progressbar, ImageView image){
        if (labelNombre != null)
            labelNombre.setText(pokemon.nombre);

        if (labelNivel != null)
            labelNivel.setText(pokemon.nivel);

        if (labelVida != null)
            labelVida.setText(pokemon.vidaRestante + "/" + pokemon.vidaTotal);

        if (progressbar != null)
            progressbar.setProgress((double)pokemon.vidaRestante/(double)pokemon.vidaTotal);

    }
}
