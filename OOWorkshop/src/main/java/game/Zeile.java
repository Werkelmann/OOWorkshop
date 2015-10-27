package game;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Zeile
{
    List<Zelle> zellen;


    public Zeile(Groesse groesse)
    {
        zellen = new ArrayList<Zelle>();
        groesse.bauZellen(zellen);
    }


    public void print(StringBuilder ausgabe)
    {
        for (Zelle zelle : zellen)
        {
            zelle.print(ausgabe);
        }
    }


    public void verteileMine()
    {
        Random random = new Random();
        int size = zellen.size();
        int index = random.nextInt(size);
        if (zellen.get(index) instanceof Zähler)
        {
            zellen.set(index, new Mine());
            return;
        }
        verteileMine();
    }


    public boolean markiere(int spalte)
    {
        Zelle zelle = zellen.get(spalte);
        zelle.deckAuf();
        if (zelle instanceof Mine)
        {
            System.out.println("TOT");
            return true;
        }
        return false;
    }
}
