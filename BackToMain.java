import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackToMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackToMain extends Button
{
    /**
     * Act - do whatever the BackToMain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BackToMain(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        
        }
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new MainMenu());
        }
    }    
}
