package game;


public class Zähler extends Zelle
{

    @Override
    public AusgabeZeichen print()
    {
        if (istAufgedeckt) {
            return new AusgabeZeichen('x');
        }
        return new AusgabeZeichen('#');
    }

}



