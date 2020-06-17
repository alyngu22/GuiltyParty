import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blank extends World
{

    /**
     * Constructor for objects of class Blank.
     * 
     */
    
    public Blank(int num) {
        super(1600, 900, 1); 
        addObject(new GoBack(), 100, 92);
        if (num == 0) {
            addObject(new Description("A crime has been commited in BCA! \n Help solve the mystery and find the guilty party.\n\n CRIME DETAILS: \n The cart of laptops in Commons goes missing. \n When investigated, the administration realizes that the cart was still  there by the end of the school day,\n so it must have gone missing after school that day. \n Only ten people were still at school after the school day had ended. \n\n Collect testimony and clues from suspects to find the guilty party. \n To maneuver, click a room with a label on it to go to that room. Each room can only be visited once! \n To interact with a character or clue, click on the character or clue. \nWith character testimonies, hover over the testimony. \nIf the testimony is red, the character is lying. If green, the character is telling the truth. \nTo use the notepad, click the notepad icon and go through the dropdown menus. \nOnce all characters and clues are found, you have 3 chances to accuse the right character. Choose wisely! \n If the right character is accused, back your accusation with clues and testimonies that help you prove your choice."), 800, 400); 
        }
        else if (num == 1) {
            Description d = new Description("Creators: Alyssa Nguyen and Isabel Ting.\n\nInspired by Wii Guilty Party.\n\nCharacters: Isabel Ting\n\nBackgrounds: Google.\n\nThank you for playing!"); 
            addObject(d, 800, 400);
        }
    }
}
