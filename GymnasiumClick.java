import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GymnasiumClick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GymnasiumClick extends Rooms
{
    /**
     * Act - do whatever the GymnasiumClick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean visited = false;
    public void act() 
    {
        if (Greenfoot.mousePressed(this) && !visited) {
           visited = true;
           Greenfoot.setWorld(new Gymnasium());
        }
        if (visited) {
            getImage().setTransparency(255);
            setImage(new GreenfootImage("X.png"));

        }
    }
}
