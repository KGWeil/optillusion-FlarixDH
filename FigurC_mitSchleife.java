
import processing.core.PApplet;

/**
 * Klasse figurC_mitSchleife.
 * Beschreibung: Die FigurC aus der vorherigen Aufgabe soll mit einer Zählschleife implementiert werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class FigurC_mitSchleife extends PApplet
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

    public void zeichneBildC() {
        // Herr Gebert = Java
           
         int x=200;
         int y=200;
         int b=200;
         int h=200;
         int d=150;
        
         rect( x, y, b, h);
          for (int i=0; i<=2; i++){
         
         
         circle(x+100, y+100, d);

         d-=50;
         
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
        zeichneBildC(); // Aufruf deiner Methode
    }


    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {FigurC_mitSchleife.class.getName() });
    }

}
