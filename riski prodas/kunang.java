import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kunang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kunang extends Actor
{
    /**
     * Act - do whatever the kunang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")){
            move(-5);
    }    
    if(Greenfoot.isKeyDown("right")){
            move(5);
    }    
    if(Greenfoot.isKeyDown("up")){
            move(-6);
    }    
    if(Greenfoot.isKeyDown("down")){
            turn(6);
    }    
    Actor ceri = getOneObjectAtOffset(0,0, ceri.class);
    if(ceri != null){
        getWorld().removeObject(ceri);
        score.ceri++;
    }
    if(score.ceri == 3) {
        getWorld().addObject(new kalah(),300, 200);
        Greenfoot.stop();
    }
}
}
