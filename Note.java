import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Note here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Note extends Actor
{
    /**
     * Act - do whatever the Note wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Note(int size) {
        if (size == 1) {
            getImage().scale(500,500);
        }
    }
    public Note() {
        this(0);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
