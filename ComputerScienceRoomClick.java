import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ComputerScienceRoomClick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComputerScienceRoomClick extends Rooms
{
    /**
     * Act - do whatever the ComputerScienceRoomClick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ComputerScienceRoomClick() {
        roomInt = 3;
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this) && !visited) {
            ((MainMap)getWorld()).visited[roomInt] = true;
            Greenfoot.setWorld(new ComputerScienceRoom());
        }
        // Add your action code here.
    }
}
