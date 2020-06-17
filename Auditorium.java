import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Auditorium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auditorium extends World
{

    /**
     * Constructor for objects of class Auditorium.
     * 
     */
    public int roomInt;
    public Auditorium()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1); 
        roomInt = 0;
        GreenfootImage bg = new GreenfootImage("auditorium.jpeg");
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

        AmeliaRossi ameliaRossi = new AmeliaRossi();
        addObject(ameliaRossi,1317,379);
        CaraSobeck caraSobeck = new CaraSobeck();
        addObject(caraSobeck,404,430);
    }
}
