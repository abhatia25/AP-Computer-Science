import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level11 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level11 extends World
{
    private Counter ourScore;
    public Counter getCounter()
    {
        return ourScore;
    }
    /**
     * Constructor for objects of class Level11.
     * 
     */
    public Level11()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    public Level11(Player player)
    {
        super(1200, 800, 1); 
        player.vspeed = 0;
        prepare();


        addObject(player,50,750);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        Words words = new Words();
        addObject(words,587,159);

        TeleporterEnd teleporterEnd = new TeleporterEnd();
        addObject(teleporterEnd,74,783);
        TeleporterEnd teleporterEnd2 = new TeleporterEnd();
        addObject(teleporterEnd2,224,784);
        TeleporterEnd teleporterEnd3 = new TeleporterEnd();
        addObject(teleporterEnd3,373,785);
        TeleporterEnd teleporterEnd4 = new TeleporterEnd();
        addObject(teleporterEnd4,523,785);
        TeleporterEnd teleporterEnd5 = new TeleporterEnd();
        addObject(teleporterEnd5,673,786);
        TeleporterEnd teleporterEnd6 = new TeleporterEnd();
        addObject(teleporterEnd6,822,786);
        TeleporterEnd teleporterEnd7 = new TeleporterEnd();
        addObject(teleporterEnd7,970,785);
        TeleporterEnd teleporterEnd8 = new TeleporterEnd();
        addObject(teleporterEnd8,1118,785);
    }
}
