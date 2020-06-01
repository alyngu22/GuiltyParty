import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BreezewayClick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BreezewayClick extends Rooms
{
    /**
     * Act - do whatever the BreezewayClick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BreezewayClick() {
        roomInt = 1;
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this) && !visited) {
            ((MainMap)getWorld()).visited[roomInt] = true;
            Greenfoot.setWorld(new Breezeway());
        }
        // Add your action code here.
    }    
}
