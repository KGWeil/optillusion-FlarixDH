
import processing.core.PApplet;

/**
 * Klasse Figur_a.
 * Beschreibung: Hier sollen mehrere vorgegebene Figur_a gezeichnet werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class Figur_a extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(800, 600); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC(){
        // HerrGebert = Java
        
        circle(250, 150, 100);
        rect(200, 200, 100, 100);
        triangle(300, 400, 250, 300, 200, 400);
           
        // ***** Ende der eigenen Anweisungen **********
    }

    //***** Zusatzaufgabe bzw. Hausaufgabe *************
    public void zeichneBildA() {
        // ***** hier kommen deine Anweisungen hin ************

        // ***** Ende der eigenen Anweisungen **********  
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
        // zeichneBildA();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Figur_a.class.getName() });
    }
}
