import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rooms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rooms extends Actor
{
    /**
     * Act - do whatever the Rooms wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int roomInt;
    public boolean visited;
    public Rooms() {
        visited = ((MainMap)getWorld()).visited[roomInt];
        getImage().setTransparency(0);
    }
    
    
}
