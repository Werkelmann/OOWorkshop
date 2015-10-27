package ui;

import game.Spielfeld;

public class SpielfeldViewer
{
    Spielfeld spielfeld;

    public SpielfeldViewer(Spielfeld spielfeld)
    {
        this.spielfeld = spielfeld;
    }

    public void print()
    {
        StringBuilder ausgabe = new StringBuilder();

        spielfeld.print(ausgabe);

        System.out.println(ausgabe.toString());
    }

}



