import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bubble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bubble extends Actor
{
    /**
     * Act - do whatever the Bubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bubble(int num) {
        if (num == 1) {
            setImage(new GreenfootImage("Bubble.png"));
        }
    }
    public Bubble() {
            this(0);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
