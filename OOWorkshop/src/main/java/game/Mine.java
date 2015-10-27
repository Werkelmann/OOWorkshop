package game;


public class Mine extends Zelle
{

    @Override
    public AusgabeZeichen print()
    {
        if (istAufgedeckt) {
            return new AusgabeZeichen('*');
        }
        return new AusgabeZeichen('#');
    }

}



