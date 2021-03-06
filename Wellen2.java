
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen2 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(600,650);
    }        
    boolean G=false;
    int grün=0xff33cc33;
    int weiß=0xffFFFFFF;
    public int x_1;
    public int y_1;
    public int s;
    public void zeichneQuadrat(int x, int y, int s)
    {
        fill(grün);
        noStroke();
        rect(x+6, y+6, s-12, s-12);
    }

    public void zeichne_umrandung(int x, int y, int s){
        fill(grün);
        noStroke();
        rect(x, y, s, s);

        fill(weiß);
        noStroke();
        rect(x+6, y+6, s-12, s-12);
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {
        x_1 = 10;
        y_1 = 10;
        s = 50;
        background(255, 255, 255);
        for(int zeile=0;zeile<12;zeile++){
            for(int reihe=0;reihe<11;reihe++){
                if(G==true){
                    zeichneQuadrat(x_1+50*reihe, y_1+50*zeile, s);
                    G=false;
                }
                else if(G==false){
                    zeichne_umrandung(x_1+50*reihe, y_1+50*zeile, s);
                    G=true;
                }
            }
        }
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen2.class.getName() });
    }

}
