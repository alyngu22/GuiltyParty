import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Submit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Submit extends Actor
{
    public static int tries = 2;
    public static int round = 1;
    /**
     * Act - do whatever the Submit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this) && tries >= 0) {
            getWorld().removeObjects(getWorld().getObjects(Description.class));
            switch(round) {
                case 1: 
                    if (AccusationRoom.clickedChar != null && AccusationRoom.clickedChar.equals(DropDownSuspects.graceIvanovaTag)) {
                        getWorld().addObject(new Description("Great! \n\n Grace Ivanova gives herself \n\n and Jared Paladcki an alibi!" ), 685, 300);
                        DropDownSuspects.graceIvanovaTag.cleared();
                        DropDownSuspects.jaredPadaleckiTag.cleared();
                        Greenfoot.delay(300);
                        getWorld().removeObjects(getWorld().getObjects(Description.class));
                        getWorld().addObject(new Description("Fine! How do you know \n\n it wasn't Mr. Respass or any \n\n other teacher?"), 685, 300);
                        round++;
                    }
                    else {
                       getWorld().addObject(new Description("That doesn't give \n\n Jared Paladecki an alibi.\n\n You have " + tries-- + " more tries."), 685, 300);
                    }
                    break;
                case 2: 
                    if (AccusationRoom.clickedClue != null && AccusationRoom.clickedClue.equals(DropDownClues.lanyardTag)) {
                        getWorld().addObject(new Description("That's right! \n\n We found a student ID \n\n card that presumably belongs \n\n to the guilty party."), 685, 300);
                        DropDownSuspects.mrRespassTag.cleared();
                        DropDownSuspects.mrsAcunaTag.cleared();
                        DropDownSuspects.msGarciaTag.cleared();
                        getWorld().removeObjects(getWorld().getObjects(Description.class));
                        getWorld().addObject(new Description("Okay. Well... what about\n\n Thomas Li and the rest of the shorties? \n\nHow do you know it wasn't \n\n any of them?"), 685, 300);
                        round++;
                    }
                    else {
                        getWorld().addObject(new Description("That doesn't give the teachers an alibi. \n\n You have " + tries-- + " more tries."), 685, 300);
                    }
                    break;
                case 3: 
                    if (AccusationRoom.clickedChar != null && AccusationRoom.clickedChar.equals(DropDownSuspects.thomasLiTag)) {
                        getWorld().addObject(new Description("Thomas and the rest are too\n\n short to unplug the laptop cart \n\nfrom the hanging chargers.\n\n It can't possibly be them!"), 685, 300);
                        DropDownSuspects.thomasLiTag.cleared();
                        DropDownSuspects.jackieBrownTag.cleared();
                        getWorld().removeObjects(getWorld().getObjects(Description.class));
                        getWorld().addObject(new Description("That's just a coincidence! What about Cara Sobeck?"), 685, 300);
                        round++;
                    }
                    else {
                        getWorld().addObject(new Description("That doesn't give Thomas Li an alibi. \n\n You have " + tries-- + " more tries."), 685, 300);
                    }
                    break;
                case 4: 
                    if (AccusationRoom.clickedChar != null && AccusationRoom.clickedChar.equals(DropDownSuspects.ameliaRossiTag)) {
                        getWorld().addObject(new Description("Cara was too busy streaming\n\n on Instragram Live to have commited \n\nthis crime."), 685, 300);
                        DropDownSuspects.caraSobeckTag.cleared();
                        getWorld().removeObjects(getWorld().getObjects(Description.class));
                        getWorld().addObject(new Description("Dang it. Okay, \n\n what about Amelia Rossi? She always\n\n seemed suspicious to me..."), 685, 300);
                        round++;
                    }
                    else {
                        getWorld().addObject(new Description("That doesn't give Cara Sobeck an alibi. \n\n You have " + tries-- + " more tries."), 685, 300);
                       
                      
                    }
                    break;
                case 5: 
                    if (AccusationRoom.clickedClue != null && AccusationRoom.clickedClue.equals(DropDownClues.hairTag)) {
                        getWorld().addObject(new Description("Of course! There was a piece \n\n of short hair left on the laptop \n\n cart. Amelia has long hair! \n\nIt couldn't be her. So...\n\nit MUST be you, Gianna Davis!"), 685, 300);
                        DropDownSuspects.ameliaRossiTag.cleared();
                    }
                    else {
                        getWorld().addObject(new Description("That doesn't give Amelia Rossi an alibi. \n\n You have " + tries-- + " more tries."), 685, 300);
                       
                      
                    }
                    break;
                default: 
                    break;
            }
        }
    }    
}
