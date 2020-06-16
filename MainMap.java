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
    static boolean[]visited = new boolean[8];
    static int count;
    static int seconds;
    static int minute;
    public static CharacterTag accusedChar; 
    public MainMap()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1); 
        prepare();
        count = 0;
    }
    public MainMap(int counts)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1); 
        prepare();
        count = counts;
    }
    public void act(){
        count++;
        showTime(); 
        if(minute>=15){
            Greenfoot.setWorld(new GameOver());
        }
        addAccusationButton();
    }
    public void addAccusationButton() {
        boolean canAdd = true;
        for (boolean b: Notepad.cluesCollected) {
            if (!b) {
                canAdd = false;
            }
        }
        for (boolean b:  Notepad.cluesCollected) {
            if (!b) {
                canAdd = false;
            }
        }
        if (canAdd) {
            addObject(new AccusationButton(), 1309,714);
        }
        
    }
    public void showTime(){
        seconds = count/55;
        if(seconds % 60 == 0){
            minute= seconds/60;
        }
        if(seconds>=60){
            int second = seconds - minute*60;
            if(second<10){
                showText(minute+ ":0" +second,50,25);
            }
            else{
                showText(minute+ ":" +second,50,25);
            }
        }
        else{
            if(seconds<10){
                showText(minute+ ":0" +seconds,50,25);
            }
            else{
                showText(minute+ ":" +seconds,50,25);
            }
        }
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
        CSRoomClick computerScienceRoomClick = new CSRoomClick();
        addObject(computerScienceRoomClick,633,622);
        GymnasiumClick gymnasiumClick = new GymnasiumClick();
        addObject(gymnasiumClick,1112,157);
        LowerCafeteriaClick lowerCafeteriaClick = new LowerCafeteriaClick();
        addObject(lowerCafeteriaClick,704,294);
        VisualRoomClick visualRoomClick = new VisualRoomClick();
        addObject(visualRoomClick,454,338);
        HallwayClick hallwayClick = new HallwayClick();
        addObject(hallwayClick,636,470);
        NotepadButton notepadButton = new NotepadButton();
        addObject(notepadButton,1509,714);

        Clue clues = new Clue();
        addObject(clues,1015,570);
        Suspect suspect = new Suspect();
        addObject(suspect,1099,566);
        Suspect suspect2 = new Suspect();
        addObject(suspect2,1378,367);
        Suspect suspect3 = new Suspect();
        addObject(suspect3,1483,208);
        Suspect suspect4 = new Suspect();
        addObject(suspect4,595,573);
        Suspect suspect5 = new Suspect();
        addObject(suspect5,689,678);
        Suspect suspect6 = new Suspect();
        addObject(suspect6,374,363);
        Clue clues2 = new Clue();
        addObject(clues2,525,311);
        Suspect suspect7 = new Suspect();
        addObject(suspect7,743,229);
        Clue clues3 = new Clue();
        addObject(clues3,885,367);
        Suspect suspect8 = new Suspect();
        addObject(suspect8,386,500);
        Suspect suspect9 = new Suspect();
        addObject(suspect9,1020,192);
        Suspect suspect10 = new Suspect();
        addObject(suspect10,66,641);
        addObject(new AccusationButton(), 1369,714);
        
    } 
}
