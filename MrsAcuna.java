import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MrsAcuna here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MrsAcuna extends Characters
{
    /**
     * Act - do whatever the MrsAcuna wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MrsAcuna() {
        super("Mrs. Acuna", true,false,true,true,false,7);
        testimony = "I saw a suspicious figure coming\n\n out of the girls bathroom right before \n\nthe time of the crime."; 

        GreenfootImage image = getImage();
        image.scale((int)image.getWidth()/2, (int)image.getHeight()/2);         
    }
    public void act() 
    {
        super.act();
    }    
}
