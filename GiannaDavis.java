import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GiannaDavis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GiannaDavis extends Characters
{
    /**
     * Act - do whatever the GiannaDavis wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GiannaDavis() {
            super("Gianna Davis", true,true,true,true,true,2, "gianna.png");
            testimony = "Between you and I, Amelia always \n\n seemed kinda shady to me. She always \n\n stayed after school for no apparent \n\n reason. Plus, I heard her laptop broke last weekend \n\n after she dropped it down the stairs."; 
            GreenfootImage image = getImage();
            image.scale((int)image.getWidth()/2, (int)image.getHeight()/2);
    }
    public void act() 
    {
        super.act();
    }    
    public String getImg(){
        return "gianna.png";
    }
}
