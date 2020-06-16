import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AccusationButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AccusationButton extends Button
{
    /**
     * Act - do whatever the AccusationButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
        getWorld().addObject(new TestimonyFrame(2),800,400);
        getWorld().addObject(new DropDownSuspects(475,175),475,125);
        getWorld().addObject(new Description("SELECT THE GUILTY PARTY"), 800, 125);
        getWorld().addObject(new TestimonyFrame(3), 900, 400);
        getWorld().addObject(new ConfirmAccuseButton(), 1125, 675); 
        getWorld().addObject(new Cancel(), 1200, 100);
    }
    }    
}
