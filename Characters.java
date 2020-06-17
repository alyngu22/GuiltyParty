import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
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
    public String img;
    public boolean k = false;
    static protected boolean[] hasGivenTestimony = new boolean[10];
    /**
     * Act - do whatever the Characters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Characters(String name, boolean hair, boolean height, boolean weight, boolean gender, boolean position, int num, String image) {
        this.name = name;
        hasShortHair = hair;
        isTall = height;
        isThin = weight;
        isFemale = gender;
        isStudent = position;
        charInt = num;
        img= image;
    }
    public void act() 
    {
            
        if (Greenfoot.mousePressed(this)) {
            giveTestimony();
        }
        List<OKButton> list= getWorld().getObjects(OKButton.class);
        if(list.size() == 0&&k){
            getWorld().removeObject(this);
        }
    }
    public void giveTestimony(){
        DropDownSuspects d = new DropDownSuspects();
        CharacterTag chartag = d.getTag(charInt);
        chartag.revertImage();
        this.setImage(img);
        this.setLocation(300, 600);
        Testimony t;
        if (charInt == 5 || charInt == 8) {
            t = new Testimony(this.getTestimony(), false);
        }
        else {
            t = new Testimony(this.getTestimony(),true);
        }
        
        TestimonyFrame frame = new TestimonyFrame(1);
        OKButton ok = new OKButton(getTestimony());
        Notepad.suspectedCollected[charInt] = true;
        getWorld().addObject(frame, 900,360);
        getWorld().addObject(chartag, 642, 120);
        getWorld().addObject(t, 900, 360);
        getWorld().addObject(ok, 1200, 600);
        k = true;
    }
    public String getTestimony() {
        return testimony;
        
    }
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
