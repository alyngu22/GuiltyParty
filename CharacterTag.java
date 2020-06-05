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
    public boolean clicked = false;
    public int cInt;
    public void act() 
    {
        showCharacter();
    }    
    public void showCharacter() {
        if (Greenfoot.mouseClicked(this)) {
            Characters c = suspects[cInt];
            getWorld().removeObjects(getWorld().getObjects(Description.class));
            Description d = new Description(c.getDescription());
            getWorld().addObject(d,1200,350);
        }
    }
}
