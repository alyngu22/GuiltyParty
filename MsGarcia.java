import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MsGarcia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MsGarcia extends Characters
{
    /**
     * Act - do whatever the MsGarcia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MsGarcia() {
        super("Ms. Garcia", true,true,false,true,false,8);
        testimony = "Oh no! Isn’t what happened\n\n horrible?! I never would have expected \n\nsomething like this to happen \n\nat BCA!";
        GreenfootImage image = getImage();
        image.scale((int)image.getWidth()/2, (int)image.getHeight()/2); 
    }
    public void act() 
    {
        super.act();
    }    
}
