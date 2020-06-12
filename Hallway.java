
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hallway here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hallway extends World
{

    /**
     * Constructor for objects of class Hallway.
     * 
     */
    public Hallway()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1); 
        GreenfootImage bg = new GreenfootImage("Hallway.png");
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
        MrsAcuna mrsAcuna = new MrsAcuna();
        addObject(mrsAcuna,1041,482);
        Locker locker = new Locker();
        addObject(locker,165,578);
    }
}
