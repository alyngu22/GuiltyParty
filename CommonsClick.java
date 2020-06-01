import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CommonsClick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommonsClick extends Rooms
{
    /**
     * Act - do whatever the CommonsClick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public CommonsClick() {
        roomInt = 2;
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this) && !visited) {
            ((MainMap)getWorld()).visited[roomInt] = true;
            Greenfoot.setWorld(new Commons());
        }
        // Add your action code here.
    }  
}
