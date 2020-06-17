import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AmeliaRossi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AmeliaRossi extends Characters
{
    /**
     * Act - do whatever the AmeliaRossi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AmeliaRossi() {
            super("Amelia Rossi",false,true,true,true,true,0, "amelia.png");
            testimony = "One thing is for sure, it can’t possibly \n\n be Cara. I saw that she was livestreaming \n\n on Instagram Live about her new crystal \n\n Heelys after school.";
            GreenfootImage image = getImage();
            image.scale((int)image.getWidth()/2, (int)image.getHeight()/2);
    }
    public void act() 
    {
        super.act();
    }
}
