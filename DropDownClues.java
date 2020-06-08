
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
          HairTag hairTag = new HairTag();
          LanyardTag lanyardTag = new LanyardTag();
          LockerTag lockerTag = new LockerTag();
          public ClueTag[] cluesTagArray = {hairTag, lanyardTag, lockerTag};
               


        public void act() 
        {
            if (Greenfoot.mouseClicked(this)) {
                if (!isExpanded) {
                    expand();
                }
                else {
                    collapse();
                }
            }
        }    
        public void expand() {
                for (int i = 0; i < cluesTagArray.length; i++) {
                  //  if (((Notepad)getWorld()).cluesCollected[i]){
                        getWorld().addObject(cluesTagArray[i],330,200 + (i * 50));
                  //  }
                  //  else {
                  //      cluesTagArray[i].changeImage();
                  //      getWorld().addObject(cluesTagArray[i], 330, 200 + (i * 50));
                  //  }
                }
                 isExpanded = true;
            }
        public void collapse() {
                for (int i = 0; i < cluesTagArray.length; i++) {
                    getWorld().removeObject(cluesTagArray[i]);
                }
            }
    }
    
