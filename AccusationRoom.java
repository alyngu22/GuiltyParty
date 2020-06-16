import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AccusationRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AccusationRoom extends World
{

    /**
     * Constructor for objects of class AccusationRoom.
     * 
     */
    public static int tries = 2;
    public AccusationRoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Block block = new Block();
        addObject(block,800,400);
    }
}
