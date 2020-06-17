import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blank extends World
{

    /**
     * Constructor for objects of class Blank.
     * 
     */
    public Blank()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 900, 1); 
        addObject(new GoBack(), 100, 92);
    }
}
