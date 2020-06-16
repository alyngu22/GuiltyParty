import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cancel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cancel extends Button
{
    /**
     * Act - do whatever the Cancel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            getWorld().removeObjects(getWorld().getObjects(Description.class));
            getWorld().removeObjects(getWorld().getObjects(TestimonyFrame.class));
            getWorld().removeObjects(getWorld().getObjects(DropDownSuspects.class));
            getWorld().removeObjects(getWorld().getObjects(ConfirmAccuseButton.class));
            getWorld().removeObjects(getWorld().getObjects(CharacterTag.class));

            getWorld().removeObject(this);
           
        }
    }    
}
