
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DropDownClues here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DropDownClues extends Button
{
    /**
     * Act - do whatever the DropDownClues wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
          public boolean isExpanded = false;
          public static HairTag hairTag = new HairTag();
          public static LanyardTag lanyardTag = new LanyardTag();
          public static LockerTag lockerTag = new LockerTag();
          public ClueTag[] cluesTagArray = {hairTag, lanyardTag, lockerTag};
           public int x;
            public int y;
                    

        public DropDownClues(int x, int y) {
                    this.x = x;
                    this.y = y;
                    
         }
        public DropDownClues() {
            this(330,200);
        }
        public void act() 
        {
            if (Greenfoot.mouseClicked(this)) {
                if (!isExpanded) {
                    expand();
                }
                else {
                    collapse();
                    isExpanded = false;
                }
            }
        }    
        public void expand() {
                for (int i = 0; i < cluesTagArray.length; i++) {
                    if (!Notepad.cluesCollected[i]){
                      
                        cluesTagArray[i].changeImage();
                    }
                    cluesTagArray[i].isAccused = true;
                    getWorld().addObject(cluesTagArray[i], x, y + (i * 50));
                    
                }
                 isExpanded = true;
            }
        public void collapse() {
                for (int i = 0; i < cluesTagArray.length; i++) {
                    getWorld().removeObject(cluesTagArray[i]);
                }
            }
        public ClueTag getTag(int c){
            return cluesTagArray[c];
        }
    }
    
