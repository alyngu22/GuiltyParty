import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Evidence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evidence extends Actor
{
    /**
     * Act - do whatever the Evidence wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int eNum;
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            Notepad.cluesCollected[eNum] = true;
        }
    }    
}
