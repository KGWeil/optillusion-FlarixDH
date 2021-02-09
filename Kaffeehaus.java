import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{       
    
    int s = 40;
    int[] abstaende = {10, 20, 30, 20, 10, 20, 30, 20, 10};

    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    public void parallelen()
    {
        int x1=20;
        int y1=40;
        int x2=600;
        int y2=40;

        for (int i=0; i<10; i++){
            line(x1, y1*i, x2, y2*i);       
        }
    }
    // Zeichnet Quadrate
    public void zeichneQuadrate()
    {
      
    }
    
    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {
     fill(0);
     int s=40;
     fill(0); // Füllfarbe schwarz
        for (int j=0; j<=8; j++){
            for (int i=0; i<=7; i++){
                // rect(10+2*s*i,5+j*s,s,s);  // Abstand bei allen Reihen gleich: d=10
                rect(abstaende[j]+2*s*i, 5+j*s, s, s);  // Abstand wird jeweils aus dem Feld gelesen
            }
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
        background(255);
        parallelen();
        draw();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
