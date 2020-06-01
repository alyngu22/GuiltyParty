import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Characters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Characters extends Actor
{
    protected boolean hasShortHair;
    protected boolean isTall;
    protected boolean isThin; 
    protected boolean isFemale;
    protected boolean isStudent;
    protected int charInt; 
    
    static protected boolean[] hasGivenTestimony = new boolean[10];
    
    /**
     * Act - do whatever the Characters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Characters(boolean hair, boolean height, boolean weight, boolean gender, boolean position, int num) {
        hasShortHair = hair;
        isTall = height;
        isThin = weight;
        isFemale = gender;
        isStudent = position;
        charInt = num;
    }
    public void act() 
    {
        if (canGiveTestimony()) {
            giveTestimony();
        }
    }   
    
    public boolean canGiveTestimony() {
        if (Greenfoot.mousePressed(this) || !hasGivenTestimony[charInt]) {
           hasGivenTestimony[charInt] = true;
           return true;
        }
        return false;
    }
    
    public void giveTestimony(){
    
    }
}
