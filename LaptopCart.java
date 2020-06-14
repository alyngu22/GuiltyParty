import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaptopCart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaptopCart extends Actor
{
    /**
     * Act - do whatever the LaptopCart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LaptopCart(){
        GreenfootImage image = getImage();
        image.scale((int)image.getWidth()/2, (int)image.getHeight()/2);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
