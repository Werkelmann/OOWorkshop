package game;


public class AusgabeZeichen
{
    char zeichen;

    public AusgabeZeichen(char zeichen) {
        this.zeichen = zeichen;
    }

    public void print(StringBuilder ausgabe) {
        ausgabe.append(zeichen);
    }
}



