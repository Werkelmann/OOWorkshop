package game;

import io.Koordinate;

public class Spielfeld
{
    Spalten spalten;

    public Spielfeld(Groesse groesse, MinenVerteiler verteiler)
    {
        spalten = new Spalten(groesse, verteiler);
    }

    public void print(StringBuilder ausgabe)
    {
        spalten.print(ausgabe);
    }

    public boolean markiere(Koordinate koordinate)
    {
        return spalten.markiere(koordinate);
    }
}



