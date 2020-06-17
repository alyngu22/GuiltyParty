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
    public int cluesInt;
    public final boolean available = true;
    /**
     * Act - do whatever the ClueTag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        showDescription();
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
       // available = false;
       //  setImage(new GreenfootImage("NotAvailableTag.png"));
    }
}
