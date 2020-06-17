import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Breezeway here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Breezeway extends World
{

    /**
     * Constructor for objects of class Breezeway.
     * 
     */
    public int roomInt;
    public Breezeway()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1); 
        roomInt = 1;
        GreenfootImage bg = new GreenfootImage("breezeway.jpg");
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

        MapButton mapButton = new MapButton(1);
        addObject(mapButton,58,57);
        GiannaDavis giannaDavis = new GiannaDavis();
        addObject(giannaDavis,1158,420);
    }
}
