import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JaredPadalecki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JaredPadalecki extends Characters
{
    /**
     * Act - do whatever the JaredPadalecki wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public JaredPadalecki() {
        super("Jared Padalecki", false,true,true,false,true,5, "jared.png");
        testimony = "I was at football practice. \n\n Go BCA Knights!";
        GreenfootImage image = getImage();
        image.scale((int)image.getWidth()/2, (int)image.getHeight()/2);        
    }
    public void act() 
    {
        super.act();
    }    
}
