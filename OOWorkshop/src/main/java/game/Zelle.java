package game;


public abstract class Zelle
{
    boolean istAufgedeckt = false;

    public void print(StringBuilder ausgabe)
    {
        print().print(ausgabe);
    }

    public abstract AusgabeZeichen print();

    public void deckAuf()
    {
        this.istAufgedeckt = true;
    }
}



