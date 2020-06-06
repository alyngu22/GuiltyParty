
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DropDownButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DropDownButton extends Button
{
    /**
     * Act - do whatever the DropDownButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
           public boolean isExpanded = false;
            AmeliaRossiTag ameliaRossiTag = new AmeliaRossiTag();
            CaraSobeckTag caraSobeckTag = new CaraSobeckTag();
            GiannaDavisTag giannaDavisTag = new GiannaDavisTag();
            GraceIvanovaTag graceIvanovaTag = new GraceIvanovaTag();
            JackieBrownTag jackieBrownTag = new JackieBrownTag();
            JaredPadaleckiTag jaredPadaleckiTag = new JaredPadaleckiTag();
            MrRespassTag mrRespassTag = new MrRespassTag();
            MrsAcunaTag mrsAcunaTag = new MrsAcunaTag();
            MsGarciaTag msGarciaTag = new MsGarciaTag();
            ThomasLiTag thomasLiTag = new ThomasLiTag();
            public CharacterTag[] cTagArray = {ameliaRossiTag, caraSobeckTag, giannaDavisTag, graceIvanovaTag, jackieBrownTag, jaredPadaleckiTag, mrRespassTag, mrsAcunaTag, msGarciaTag,thomasLiTag};

               


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
                for (int i = 0; i < cTagArray.length; i++) {
                    //if (((Notepad)getWorld()).suspectedCollected[i]){
                        getWorld().addObject(cTagArray[i],150,200 + (i * 50));
                    //}
                }
                 isExpanded = true;
            }
        public void collapse() {
                for (int i = 0; i < cTagArray.length; i++) {
                    getWorld().removeObject(cTagArray[i]);
                }
            }
    }
    
