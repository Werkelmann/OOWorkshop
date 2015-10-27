package defaultPackage;

import game.Groesse;
import game.MinenVerteiler;
import game.Spielfeld;
import io.InputHandler;
import ui.SpielfeldViewer;

public class Main
{

    public static void main(String[] args)
    {
        Groesse groesse = new Groesse(5);
        MinenVerteiler verteiler = new MinenVerteiler(5, groesse);
        Spielfeld spielfeld = new Spielfeld(groesse, verteiler);
        SpielfeldViewer viewer = new SpielfeldViewer(spielfeld);
        viewer.print();
        InputHandler handler = new InputHandler(spielfeld, viewer);
        handler.loop();
    }

}



