 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Description here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Description extends Button
{
    /**
     * Act - do whatever the Description wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean isTrue;
    public String description;
    public Description(String s, boolean correct) {
        description = s;
        setImage(new GreenfootImage(description,30,null,null));
        isTrue = correct;
    }
    public void act() 
    {
        lieDetector();   
    }    
    public void lieDetector() {
        if (Greenfoot.mouseMoved(this)) {
            if (isTrue) {
                setImage(new GreenfootImage(description, 30, Color.GREEN, null));
            }
            else {
                setImage(new GreenfootImage(description, 30, Color.RED, null));
            }
        }
       // else {
       //     setImage(new GreenfootImage(description, 30, null, null));

       // }
        
    }
}
