import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CSRoomClick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CSRoomClick extends Rooms
{
    /**
     * Act - do whatever the CSRoomClick wants to do. This method is called whenever
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
