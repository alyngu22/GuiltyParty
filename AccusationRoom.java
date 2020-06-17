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
    public static CharacterTag clickedChar; 
    public static ClueTag clickedClue;

    public AccusationRoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1); 

        prepare();
        interrogation();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Block block = new Block();
        addObject(block,800,400);
        GiannaDavis giannaDavis = new GiannaDavis();
        addObject(giannaDavis,313,386);
        Bubble bubble = new Bubble();
        addObject(bubble,661,400);
        Bubble bubble2 = new Bubble(1);
        addObject(bubble2,1156,400);
        DropDownSuspects dropDownSuspects = new DropDownSuspects(1058,229);
        addObject(dropDownSuspects,1058,179);
        DropDownClues dropDownClues = new DropDownClues(1254,229);
        addObject(dropDownClues,1254,179);
        Submit submit = new Submit();
        addObject(submit,697,648);
    }
    
    public void interrogation() {
        addObject(new Description("Ugh. How do you \n\n know it was even me?\n\n It could be anyone. \n\n How do you know it wasn't \n\n Jared Padalecki?"),685, 300); 
        
    }
}
