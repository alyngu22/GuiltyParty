import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConfirmAccuseButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConfirmAccuseButton extends Button
{
    /**
     * Act - do whatever the ConfirmAccuseButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int tries = 2;
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            getWorld().removeObjects(getWorld().getObjects(Description.class));
            if (MainMap.accusedChar != null && tries >= 0) {
                if (MainMap.accusedChar.equals(DropDownSuspects.giannaDavisTag)) {
                    getWorld().addObject(new Description("That's right! Now you have to prove it!"), 900, 400);
                    Greenfoot.delay(10);
                    //MainMap world = getWorld();
                    Greenfoot.setWorld(new AccusationRoom());
                }
                else {
                   getWorld().addObject(new Description("You've falsely accused someone of a crime \n\n they didn't commit! \n\n You have " + tries + " more attempts."),900,400 );
                   tries--;
                }
            }
        }
    }    
}
