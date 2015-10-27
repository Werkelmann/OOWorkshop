package game;

import java.util.ArrayList;
import java.util.List;

import io.Koordinate;

public class Spalten
{
    List<Zeile> zeilen;

    public Spalten(Groesse groesse, MinenVerteiler verteiler)
    {
        zeilen = new ArrayList<Zeile>();
        groesse.bauZeilen(zeilen);
        verteilMinen(verteiler);
    }

    private void verteilMinen(MinenVerteiler verteiler)
    {
        for (Zeile zeile : zeilen) {
            verteiler.verteileMinen(zeile);
        }
    }

    public void print(StringBuilder ausgabe)
    {
        for (Zeile zeile : zeilen) {
            zeile.print(ausgabe);
            ausgabe.append("\n");
        }
    }

    public boolean markiere(Koordinate koordinate)
    {
        return koordinate.markiere(zeilen);
    }


}



