
import processing.core.PApplet;

/**
 * Klasse WasZeichneIch.
 * Beschreibung: Code lesen und verstehen.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class WasZeichneIch extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(800,500);
    }        

    // Überlege dir, was die Anweisungen in der Methode "wasZeichneIch" auslösen könnten
    // Verändere die Werte, die den Methoden übergeben werden. Was passiert?
    public void wasZeichneIch() {
        line(100, 400, 5, 250);
        ellipse(400, 200, 30, 90);
        rect(300, 100, 250, 20);
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        wasZeichneIch();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {WasZeichneIch.class.getName() });
    }

}
