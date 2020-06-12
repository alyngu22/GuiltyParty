import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Characters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Characters extends Actor
{
    public String name;
    public String testimony;
    public boolean hasShortHair;
    public boolean isTall;
    public boolean isThin; 
    public boolean isFemale;
    public boolean isStudent;
    public int charInt; 
    
    static protected boolean[] hasGivenTestimony = new boolean[10];
    
    /**
     * Act - do whatever the Characters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Characters(String name, boolean hair, boolean height, boolean weight, boolean gender, boolean position, int num) {
        this.name = name;
        hasShortHair = hair;
        isTall = height;
        isThin = weight;
        isFemale = gender;
        isStudent = position;
        charInt = num;
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            Notepad.suspectedCollected[charInt] = true;
            getWorld().removeObject(this);
        }
        /*if (canGiveTestimony()) {
            giveTestimony();
            Notepad.suspectedCollected[charInt] = true;
        }*/
    }   
    public String getTestimony() {
        return testimony;
    }
    /*public boolean canGiveTestimony() {
        if (Greenfoot.mousePressed(this)) {
           getWorld().removeObject(this);
           return true;
        }
        return false;
    }*/
    
    
    public String getDescription() {
        String s = "";
        s += name;
        s += " is a ";
        if (isFemale) {
            s+= "female ";
        }
        else {
            s+= "male ";
        }
        s += "with";
        if (hasShortHair) {
            s+= " short ";
        }
        else {
            s += " long ";
        }
        s += "hair. \n\n";
        s += name;
        s += " is";
        if (isTall) {
            s += " tall ";
        }
        else {
            s += " short ";
        }
        s += "and";
        if (isThin) {
            s += " thin. ";
        }
        else {
            s += " round. ";
        }
        s += "\n\n";
        s += name;
        s += " is currently a ";
        if (isStudent) {
            s += "student ";
        }
        else {
            s += "teacher ";
        }
        s += "at \n\n Bergen County Academies.";
        return s;
    }
}
