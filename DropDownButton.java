
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
                 getWorld().addObject(ameliaRossiTag,150,200);
                 getWorld().addObject(caraSobeckTag,150,250);
                 getWorld().addObject(giannaDavisTag,150,300);
                 getWorld().addObject(graceIvanovaTag,150,350);
                 getWorld().addObject(jackieBrownTag,150,400);
                 getWorld().addObject(jaredPadaleckiTag,150,450);
                 getWorld().addObject(mrRespassTag,150,500);
                 getWorld().addObject(mrsAcunaTag,150,550);
                 getWorld().addObject(msGarciaTag,150,600);
                 getWorld().addObject(thomasLiTag,150,650);
                 isExpanded = true;
            }
        public void collapse() {
                getWorld().removeObject(ameliaRossiTag);
                 getWorld().removeObject(caraSobeckTag);
                 getWorld().removeObject(giannaDavisTag);
                 getWorld().removeObject(graceIvanovaTag);
                 getWorld().removeObject(jackieBrownTag);
                 getWorld().removeObject(jaredPadaleckiTag);
                 getWorld().removeObject(mrRespassTag);
                 getWorld().removeObject(mrsAcunaTag);
                 getWorld().removeObject(msGarciaTag);
                 getWorld().removeObject(thomasLiTag);
                 isExpanded = false;
            }
    }
    
