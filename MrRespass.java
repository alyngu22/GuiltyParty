import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MrRespass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MrRespass extends Characters
{
    /**
     * Act - do whatever the MrRespass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MrRespass() {
        super("Mr. Respass", true,true,true,false,false,6);
        GreenfootImage image = getImage();
        image.scale((int)image.getWidth()/2, (int)image.getHeight()/2); 
    }
    public void act() 
    {
        super.act();
    }    
}
