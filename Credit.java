import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends Button
{
    /**
     * Act - do whatever the Credit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Credit(){
        
    }
    public void act() 
    {if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new Blank(1));
            
        }
        
    }    
}
