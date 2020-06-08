import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThomasLi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThomasLi extends Characters
{
    /**
     * Act - do whatever the ThomasLi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ThomasLi() {
        super("Thomas Li",true,false,true,false,true,9);
        GreenfootImage image = getImage();
        image.scale((int)image.getWidth()/2, (int)image.getHeight()/2); 
    }
    public void act() 
    {
        super.act();
    }    
}
