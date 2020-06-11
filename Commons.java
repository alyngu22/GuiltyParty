import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Commons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Commons extends World
{

    /**
     * Constructor for objects of class Commons.
     * 
     */
    public int roomInt;
    public Commons()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1); 
        GreenfootImage bg = new GreenfootImage("commons.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        roomInt = 2;
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        MapButton mapButton = new MapButton();
        addObject(mapButton,58,57);
        JackieBrown jackieBrown = new JackieBrown();
        addObject(jackieBrown,1107,229);
    }
}
