import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1); 
        GreenfootImage bg = new GreenfootImage("Grass.jfif");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        prepare();
    }
    
    public void prepare(){
        Title title = new Title();
        addObject(title,800,92);
        Start start=  new Start();
        addObject(start, 800, 292);
        Instruction instruct = new Instruction();
        addObject(instruct, 800, 492);
        Credit cred = new Credit();
        addObject(cred, 800, 692);
    }
}
