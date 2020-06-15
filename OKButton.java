import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OKButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OKButton extends Button
{
    /**
     * Act - do whatever the OKButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public OKButton(){
        GreenfootImage image = this.getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            isPressed();
        }
    }   
    public void isPressed(){
        getWorld().removeObjects(getWorld().getObjects(Description.class)); 
        getWorld().removeObjects(getWorld().getObjects(TestimonyFrame.class));
        getWorld().removeObjects(getWorld().getObjects(ClueTag.class));
        getWorld().removeObjects(getWorld().getObjects(CharacterTag.class));
        getWorld().removeObjects(getWorld().getObjects(Testimony.class));

        getWorld().removeObject(this);
    }
}
