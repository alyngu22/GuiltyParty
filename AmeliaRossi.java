import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AmeliaRossi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AmeliaRossi extends Characters
{
    /**
     * Act - do whatever the AmeliaRossi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AmeliaRossi() {
            super("Amelia Rossi",false,true,true,true,true,8);
            GreenfootImage image = getImage();
            image.scale((int)image.getWidth()/2, (int)image.getHeight()/2);
    }
    public void act() 
    {
    }    
}
