
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DropDownSuspects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DropDownSuspects extends Button
{
    /**
     * Act - do whatever the DropDownSuspects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
           public boolean isExpanded = false;
            public static AmeliaRossiTag ameliaRossiTag = new AmeliaRossiTag();
            public static CaraSobeckTag caraSobeckTag = new CaraSobeckTag();
            public static GiannaDavisTag giannaDavisTag = new GiannaDavisTag();
            public static GraceIvanovaTag graceIvanovaTag = new GraceIvanovaTag();
            public static JackieBrownTag jackieBrownTag = new JackieBrownTag();
            public static JaredPadaleckiTag jaredPadaleckiTag = new JaredPadaleckiTag();
            public static MrRespassTag mrRespassTag = new MrRespassTag();
            public static MrsAcunaTag mrsAcunaTag = new MrsAcunaTag();
            public static MsGarciaTag msGarciaTag = new MsGarciaTag();
            public static ThomasLiTag thomasLiTag = new ThomasLiTag();
            public CharacterTag[] charTagArray = {ameliaRossiTag, caraSobeckTag, giannaDavisTag, graceIvanovaTag, jackieBrownTag, jaredPadaleckiTag, mrRespassTag, mrsAcunaTag, msGarciaTag,thomasLiTag};
            public int x;
            public int y;
               

        public DropDownSuspects(int x, int y) {
            this.x = x;
            this.y = y;
            for (CharacterTag cT: charTagArray) {
                cT.accused = true;
            }
        }
        public DropDownSuspects() {
            this.x = x;
            this.y = y;
        }
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
                for (int i = 0; i < charTagArray.length; i++) {
                    
                    if (Notepad.suspectedCollected[i]){
                        if (charTagArray[i].equals(jaredPadaleckiTag) || charTagArray[i].equals(msGarciaTag)) {
                            charTagArray[i].isFalse();
                        }
                    }
                    else {
                        charTagArray[i].changeImage();
                    }
                    getWorld().addObject(charTagArray[i], x, y + (i * 50));
                }
                 isExpanded = true;
            }
        public void collapse() {
                for (int i = 0; i < charTagArray.length; i++) {
                    getWorld().removeObject(charTagArray[i]);
                }
            }
        public CharacterTag getTag(int c){
            return charTagArray[c];
        }
    }
    
