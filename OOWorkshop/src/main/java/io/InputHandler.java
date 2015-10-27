package io;

import java.util.Scanner;

import game.Spielfeld;
import ui.SpielfeldViewer;

public class InputHandler
{
    Spielfeld spielfeld;
    SpielfeldViewer viewer;

    public InputHandler(Spielfeld spielfeld, SpielfeldViewer viewer)
    {
        this.spielfeld = spielfeld;
        this.viewer = viewer;
    }

    public void loop() {
        boolean verloren = false;
        while (!verloren) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben Sie den Wert für die Spalte ein: ");
            int spalte = scanner.nextInt();
            System.out.println("Geben Sie den Wert für die Zeile ein: ");
            int zeile = scanner.nextInt();
            Koordinate koordinate = new Koordinate(spalte, zeile);
            verloren = koordinate.markiere(spielfeld);
            System.out.println();
            viewer.print();
        }
    }
}



