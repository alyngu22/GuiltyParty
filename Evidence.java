import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Evidence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evidence extends Actor
{
    /**
     * Act - do whatever the Evidence wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int eNum;
    public String description;
    public Evidence(String name) {
        description = name;
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            Notepad.cluesCollected[eNum] = true;
            giveTestimony();        
        }
    }
    public String getDescription() {
        String s = description;
        return s;
    }
    public void giveTestimony(){
        DropDownClues d = new DropDownClues();
        ClueTag cluetag = d.getTag(eNum);
        cluetag.revertImage();
        Description d1 = new Description(this.getDescription());
        TestimonyFrame frame = new TestimonyFrame(1);
        OKButton ok = new OKButton();
        Notepad.cluesCollected[eNum] = true;
        getWorld().addObject(frame, 900,360);
        getWorld().addObject(cluetag, 642, 120);
        getWorld().addObject(d1, 900, 360);
        getWorld().addObject(ok, 1200, 600);
    }
}
