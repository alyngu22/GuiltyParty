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
    public boolean isTrue = true; 
    public boolean accused = false;
    public boolean isClicked = false;
    public static GreenfootImage[] original = {new GreenfootImage("AmeliaRossiTag.png"), new GreenfootImage("CaraSobeckTag.png"), new GreenfootImage("GiannaDavisTag.png"), new GreenfootImage("GraceIvanovaTag.png"), new GreenfootImage("JackieBrownTag.png"), new GreenfootImage("JaredPadaleckiTag.png"), new GreenfootImage("MrRespassTag.png"), new GreenfootImage("MrsAcunaTag.png"), new GreenfootImage("MsGarciaTag.png"), new GreenfootImage("ThomasLiTag.png")};
    
    public void act() 
    {
        if (!accused) {
            showDescription();
        }
        else {
            if (Greenfoot.mouseClicked(this)) {
                MainMap.accusedChar = this;
                AccusationRoom.clickedChar = this;
            }
        }
        
    }
    public void showDescription() {
        if (Greenfoot.mouseClicked(this) && available) {
            Characters c = suspects[cInt];
            getWorld().removeObjects(getWorld().getObjects(Description.class));
            getWorld().removeObjects(getWorld().getObjects(Testimony.class));

            Description d = new Description(c.getDescription());
            getWorld().addObject(d,1200,350); 
            
            Testimony t = new Testimony(c.getTestimony(), isTrue);
            getWorld().addObject(t,506,548);
        }
    }
    public void notAvailable() {
        available = false;
        setImage(new GreenfootImage("NotAvailableTag.png"));
    }
    public void revertImage() {
        available = true;
        setImage(original[cInt]);
    }
    public void cleared() {
        available = false;
        setImage(new GreenfootImage("RedTag" + cInt + ".png"));
    }
    public void isFalse() {
        isTrue = false;
    }
    public void clicked() {
        if (Greenfoot.mousePressed(this)) {
            isClicked = true;
        }
    }
}
