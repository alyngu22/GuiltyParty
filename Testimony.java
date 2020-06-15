 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Testimony here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Testimony extends Button
{
    /**
     * Act - do whatever the Testimony wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean isTrue;
    public String description;
    public Testimony(String s, boolean correct) {
        description = s;
        setImage(new GreenfootImage(description,25,null,null));
        isTrue = correct;
    }
    public void act() 
    {
        lieDetector();   
    }    
    public void lieDetector() {
        if (Greenfoot.mouseMoved(this)) {
            if (isTrue) {
                setImage(new GreenfootImage(description, 25, new Color(6,151,64), null));
            }
            else {
                setImage(new GreenfootImage(description, 25, Color.RED, null));
            }
        }
    }
}
