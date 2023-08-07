import transportadora.TransporteNautico;
import transportadora.TransporteTerrestre;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TransporteNautico transporteNautico = new TransporteNautico(100, 50);
        TransporteTerrestre transporteTerrestre = new TransporteTerrestre(100, 50);

        System.out.println("Frete Náutico: " + transporteNautico.getFrete());

        System.out.println("Frete Terrestre: " + transporteTerrestre.getFrete());
    }
}