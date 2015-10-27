package game;


public class MinenVerteiler
{
    int anzahlGesamt;
    Groesse groesse;

    public MinenVerteiler(int anzahl, Groesse groesse)
    {
        this.anzahlGesamt = anzahl;
        this.groesse = groesse;
    }

    public void verteileMinen(Zeile zeile)
    {
        int anzahlProSpalte = anzahlProSpalte();
        int verteilteMinen = 0;
        while (verteilteMinen < anzahlProSpalte) {
            zeile.verteileMine();
            verteilteMinen++;
        }
    }

    private int anzahlProSpalte() {
        return groesse.minenProSpalte(anzahlGesamt);
    }
}



