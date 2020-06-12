import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaraSobeck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaraSobeck extends Characters
{
    /**
     * Act - do whatever the CaraSobeck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CaraSobeck() {
        super("Cara Sobeck", true,true,false,true,true,1);
        testimony = "Ugh. I can’t believe this happened. \n\n To think! What if the thief got to my \n\n calculator! Or my laptop! Or my $3000 \n\n Swarovski-crystal Heelys?!";
        GreenfootImage image = getImage();
        image.scale((int)image.getWidth()/2, (int)image.getHeight()/2);
    }
    public void act() 
    {
        super.act();
    }    
}
