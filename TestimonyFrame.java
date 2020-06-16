import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TestimonyFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestimonyFrame extends Actor
{
    /**
     * Act - do whatever the TestimonyFrame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TestimonyFrame(int num) {
        if (num == 1) {
            setImage(new GreenfootImage("Frame2.png"));
        }
        if (num == 2) {
            setImage(new GreenfootImage("Frame3.png"));
        }
        if (num == 3) {
            setImage(new GreenfootImage("Frame1.png"));
        }
    }
    public TestimonyFrame() {
        this(0);
    }
    public void act() 
    {
        // Add your action code here.
    }
   
    public void disappear(){
        getWorld().removeObject(this);
    }
}
