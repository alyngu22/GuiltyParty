import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LowerCafeteria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LowerCafeteria extends World
{

    /**
     * Constructor for objects of class LowerCafeteria.
     * 
     */
    public LowerCafeteria()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1);
        GreenfootImage bg = new GreenfootImage("lowercaf.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
       
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
    }
}
