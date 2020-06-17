import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClueTag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClueTag extends Button
{
    public static Evidence[] clues = {new Hair(), new Lanyard(), new Locker()};
    public static GreenfootImage[] original = {new GreenfootImage("HairTag.png"), new GreenfootImage("LanyardTag.png"), new GreenfootImage("LockerTag.png")};
    public int cluesInt;
    public boolean available = true;
    public boolean isAccused = false;
    /**
     * Act - do whatever the ClueTag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (!isAccused) {    
            showDescription();
        }
        if (Greenfoot.mouseClicked(this)) {
            AccusationRoom.clickedClue = this;
        }
    }
    public void showDescription() {
        if (Greenfoot.mouseClicked(this) && available) {
            Evidence e = clues[cluesInt];
            getWorld().removeObjects(getWorld().getObjects(Description.class));
            Description d = new Description(e.getDescription());
            getWorld().addObject(d,1200,400);
        }
    }
    public void changeImage() {
       available = false;
       setImage(new GreenfootImage("NotAvailableTag.png"));
    }
    public void revertImage() {
        available = true;
        setImage(original[cluesInt]);
    }
}
