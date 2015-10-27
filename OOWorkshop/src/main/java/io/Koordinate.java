package io;

import java.util.List;

import game.Spielfeld;
import game.Zeile;

public class Koordinate
{
    int spalte;
    int zeile;

    public Koordinate(int spalte, int zeile) {
        this.spalte = spalte;
        this.zeile = zeile;
    }

    public boolean markiere(Spielfeld spielfeld)
    {
        return spielfeld.markiere(this);
    }

    public boolean markiere(List<Zeile> zeilen)
    {
        Zeile z = zeilen.get(zeile);
        return z.markiere(spalte);
    }
}



