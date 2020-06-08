import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JackieBrown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JackieBrown extends Characters
{
    /**
     * Act - do whatever the JackieBrown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public JackieBrown() {
        super("Jackie Brown", false,false,false,true,true,4);
        GreenfootImage image = getImage();
        image.scale((int)image.getWidth()/2, (int)image.getHeight()/2);         
    }
    public void act()
    {
        super.act();
    }    
}
