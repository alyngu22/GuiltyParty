import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MapButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MapButton extends Button
{
    /**
     * Act - do whatever the MapButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int counts;
    public void act() 
    {
        counts++;
        if(counts>=49500){
            Greenfoot.setWorld(new GameOver());
        }
        if (Greenfoot.mousePressed(this)) {
            Greenfoot.setWorld(new MainMap(counts));
        }
    }    
}
