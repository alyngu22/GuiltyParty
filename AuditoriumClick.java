import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AuditoriumClick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AuditoriumClick extends Rooms
{
    /**
     * Act - do whatever the AuditoriumClick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean visited = false;
    public void act() 
    {
        if (Greenfoot.mousePressed(this) && !visited) {
           visited = true;
           Greenfoot.setWorld(new Auditorium());
        }
        if (visited) {
            getImage().setTransparency(255);
            setImage(new GreenfootImage("X.png"));

        }
    }
}
