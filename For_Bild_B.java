
import processing.core.PApplet;

/**
 * Klasse figurC_mitSchleife.
 * Beschreibung: Die FigurC aus der vorherigen Aufgabe soll mit einer Zählschleife implementiert werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class For_Bild_B extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(700,650); // Festlegen der Fenstergröße
    }        

    public void Bild_C_O() {
         
        rect(200, 100, 200, 200);
        
        int x=200;
        int y=100;
        int b=200;
        int h=200;
        int d=150;
   
        for (int i=0; i<=2; i++){
            circle(x+100, y+100, d);
            d-=35;
        }
    }

    public void Bild_C_U(){

        circle(300, 500, 300);
        
        int x=200;
        int y=400;
        int b=175;
        int h=175;
        for (int i=0; i<=2; i++){
          rect(x+25, y+25, b-25, h-25);
        }    
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        Bild_C_O();
        Bild_C_U();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {For_Bild_B.class.getName() });
    }

}
