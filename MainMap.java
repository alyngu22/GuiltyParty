import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMap extends World
{

    /**
     * Constructor for objects of class MainMap.
     * 
     */
    static boolean[] visited = new boolean[8];
    public MainMap()
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
        Title title = new Title();
        addObject(title,435,92);
        AuditoriumClick auditoriumClick = new AuditoriumClick();
        addObject(auditoriumClick,1437,292);
        BreezewayClick breezewayClick = new BreezewayClick();
        addObject(breezewayClick,126,628);
        CommonsClick commonsClick = new CommonsClick();
        addObject(commonsClick,1061,491);
        ComputerScienceRoomClick computerScienceRoomClick = new ComputerScienceRoomClick();
        addObject(computerScienceRoomClick,633,622);
        GymnasiumClick gymnasiumClick = new GymnasiumClick();
        addObject(gymnasiumClick,1112,157);
        LowerCafeteriaClick lowerCafeteriaClick = new LowerCafeteriaClick();
        addObject(lowerCafeteriaClick,704,294);
        VisualRoomClick visualRoomClick = new VisualRoomClick();
        addObject(visualRoomClick,454,338);
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) {
                switch(i) {
                    case 0: 
                        addObject(new X(), 1437,292);
                        break;
                    case 1: 
                        addObject(new X(), 126,628);
                        break;
                    case 2:
                        addObject(new X(), 1061, 491);
                        break;
                    case 3: 
                        addObject(new X(), 633, 622);
                        break;
                    case 4: 
                        addObject(new X(),1112, 157);
                        break;
                    default:
                        break;
                   
                       
                }
            }
        }
        
        
    } 
}
