import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LowerCafeteriaClick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LowerCafeteriaClick extends Rooms
{
    /**
     * Act - do whatever the LowerCafeteriaClick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LowerCafeteriaClick() {
        roomInt = 6;
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this) && !visited) {
            ((MainMap)getWorld()).visited[roomInt] = true;
            Greenfoot.setWorld(new LowerCafeteria());
        }
        // Add your action code here.
    }
}
