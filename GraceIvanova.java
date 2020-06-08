import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GraceIvanova here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GraceIvanova extends Characters
{
    /**
     * Act - do whatever the GraceIvanova wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GraceIvanova() {
        super("Grace Ivanova", true,false,false,true,true,3);
        GreenfootImage image = getImage();
        image.scale((int)image.getWidth()/2, (int)image.getHeight()/2);        
    }
    public void act() 
    {
        super.act();
    }    
}
