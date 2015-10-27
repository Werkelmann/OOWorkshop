package game;

import java.util.List;

public class Groesse
{
    int groesse;

    public Groesse(int groesse) {
        this.groesse = groesse;
    }

    public void bauZeilen(List<Zeile> zeilen)
    {
        for (int counter = 0; counter < groesse; counter++) {
            zeilen.add(new Zeile(this));
        }
    }

    public void bauZellen(List<Zelle> zellen)
    {
        for (int counter = 0; counter < groesse; counter++) {
            zellen.add(new Zähler());
        }
    }

    public int minenProSpalte(int anzahlGesamt)
    {
        return (int) (anzahlGesamt / groesse);
    }


}



