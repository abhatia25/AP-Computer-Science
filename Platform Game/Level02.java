import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level02 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level02 extends World
{
    private Counter ourScore;
    public Counter getCounter()
    {
        return ourScore;
    }
    /**
     * Constructor for objects of class Level02.
     * 
     */
    public Level02()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }

    public Level02(Player player)
    {
        super(1200, 800, 1);
        player.vspeed = 0;
        prepare();

        addObject(player, 97, 61);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ourScore = new Counter();
        addObject(ourScore,66,17);;
        Ground ground = new Ground();
        addObject(ground,75,182);
        Ground ground2 = new Ground();
        addObject(ground2,216,182);
        Wall wall = new Wall();
        addObject(wall,264,272);
        Ground ground3 = new Ground();
        addObject(ground3,367,335);
        Ground ground4 = new Ground();
        addObject(ground4,516,334);
        Ground ground5 = new Ground();
        addObject(ground5,666,333);
        Ground ground6 = new Ground();
        addObject(ground6,668,251);
        Wall wall2 = new Wall();
        addObject(wall2,769,313);
        Ground ground7 = new Ground();
        addObject(ground7,872,252);
        Wall wall3 = new Wall();
        addObject(wall3,1176,245);
        Wall wall4 = new Wall();
        addObject(wall4,1176,397);
        Ground ground8 = new Ground();
        addObject(ground8,1076,454);
        Ground ground9 = new Ground();
        addObject(ground9,925,517);
        Ground ground10 = new Ground();
        addObject(ground10,754,597);
        Ground ground11 = new Ground();
        addObject(ground11,575,689);
        Ground ground12 = new Ground();
        addObject(ground12,418,759);
        Ground ground13 = new Ground();
        addObject(ground13,278,758);
        Ground ground14 = new Ground();
        addObject(ground14,194,697);
        Ground ground15 = new Ground();
        addObject(ground15,189,629);
        Ground ground16 = new Ground();
        addObject(ground16,188,558);
        Finish finish = new Finish();
        addObject(finish,384,570);
    }
}
