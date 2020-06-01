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
    public AuditoriumClick() {
        roomInt = 0;
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this) && !visited) {
            ((MainMap)getWorld()).visited[roomInt] = true;
            Greenfoot.setWorld(new Auditorium());
        }
        // Add your action code here.
    }    
}
