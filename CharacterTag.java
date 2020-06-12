import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharacterTag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterTag extends Button
{
    /**
     * Act - do whatever the CharacterTag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static Characters[] suspects = {new AmeliaRossi(), new CaraSobeck(), new GiannaDavis(), new GraceIvanova(), new JackieBrown(), new JaredPadalecki(), new MrRespass(), new MrsAcuna(), new MsGarcia(), new ThomasLi()};
    public int cInt;
    public boolean available = true;
    public boolean isTrue; 
    public void act() 
    {
        showDescription();
    }    
    public void showDescription() {
        if (Greenfoot.mouseClicked(this) && available) {
            Characters c = suspects[cInt];
            getWorld().removeObjects(getWorld().getObjects(Description.class));
            
            Description d = new Description(c.getDescription());
            getWorld().addObject(d,1200,350); 
            
            Description d1 = new Description(c.getTestimony());
            getWorld().addObject(d1, 442, 475);
        }
    }
    public void changeImage() {
        available = false;
         setImage(new GreenfootImage("NotAvailableTag.png"));
    }
    public void isFalse() {
        isTrue = false;
    }
}
