import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class latar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class latar extends World
{

    /**
     * Constructor for objects of class latar.
     * 
     */
    public latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        kunang kunang = new kunang();
        addObject(kunang,32,196);
        ceri ceri = new ceri();
        addObject(ceri,203,99);
        ceri ceri2 = new ceri();
        addObject(ceri2,334,201);
        ceri ceri3 = new ceri();
        addObject(ceri3,482,337);
        ceri.setLocation(179,179);
        ceri.setLocation(193,259);
        ceri.setLocation(191,350);
        ceri.setLocation(196,341);
        ceri.setLocation(196,341);
        ceri.setLocation(194,339);
        ceri3.setLocation(492,62);
        bola bola = new bola();
        addObject(bola,192,55);
        bola bola2 = new bola();
        addObject(bola2,344,59);
        bola bola3 = new bola();
        addObject(bola3,44,45);
        bola.setRotation(90);
        bola2.setRotation(90);
        score score = new score();
        addObject(score,414,372);
    }
}
