package sample;

import javafx.scene.image.Image;

public class Pokemon {
    String nombre;
    String nivel;
    int vidaTotal;
    int vidaRestante;

    public Pokemon(String nombre, String nivel, int vidaTotal, int vidaRestante) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vidaTotal = vidaTotal;
        this.vidaRestante = vidaRestante;

    }
}
