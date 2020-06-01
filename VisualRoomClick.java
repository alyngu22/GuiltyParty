import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VisualRoomClick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VisualRoomClick extends Rooms
{
    /**
     * Act - do whatever the VisualRoomClick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public VisualRoomClick() {
        roomInt = 7;
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this) && !visited) {
            ((MainMap)getWorld()).visited[roomInt] = true;
            Greenfoot.setWorld(new VisualRoom());
        }
        // Add your action code here.
    }    
}
