import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Notepad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Notepad extends World
{

    /**
     * Constructor for objects of class Notepad.
     * 
     */
    public Notepad()
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

        MapButton mapButton = new MapButton();
        addObject(mapButton,58,57);
        Note note = new Note();
        addObject(note,1200,400);

        DropDownButton dropDownButton = new DropDownButton();
        addObject(dropDownButton,150,150);

       
    }
}
