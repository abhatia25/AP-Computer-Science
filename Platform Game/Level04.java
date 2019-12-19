import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level04 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level04 extends World
{
    private Counter ourScore;
    public Counter getCounter()
    {
        return ourScore;
    }
    /**
     * Constructor for objects of class Level04.
     * 
     */
    public Level04()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    public Level04(Player player)
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
        addObject(ground,72,179);
        Teleporter teleporter = new Teleporter();
        addObject(teleporter,353,781);
        Ground ground2 = new Ground();
        addObject(ground2,1126,375);
        Teleporter teleporter2 = new Teleporter();
        addObject(teleporter2,976,382);
        Ground ground3 = new Ground();
        addObject(ground3,73,785);
        Ground ground4 = new Ground();
        addObject(ground4,71,624);
        Ground ground5 = new Ground();
        addObject(ground5,72,707);
        Ground ground6 = new Ground();
        addObject(ground6,74,533);
        Ground ground7 = new Ground();
        addObject(ground7,75,437);
        Teleporter teleporter3 = new Teleporter();
        addObject(teleporter3,74,365);
        Ground ground8 = new Ground();
        addObject(ground8,1103,79);
        Ground ground9 = new Ground();
        addObject(ground9,918,145);
        Ground ground10 = new Ground();
        addObject(ground10,724,220);
        Ground ground11 = new Ground();
        addObject(ground11,534,357);
        Ground ground12 = new Ground();
        addObject(ground12,675,519);
        Ground ground13 = new Ground();
        addObject(ground13,934,629);
        Ground ground14 = new Ground();
        addObject(ground14,1129,714);
        Finish finish = new Finish();
        addObject(finish,940,784);
        Ground ground15 = new Ground();
        addObject(ground15,737,695);

        Wall wall = new Wall();
        addObject(wall,120,274);
        ground7.setLocation(121,428);
        Wall wall2 = new Wall();
        addObject(wall2,121,428);
        Wall wall3 = new Wall();
        addObject(wall3,121,580);
        Wall wall4 = new Wall();
        addObject(wall4,124,731);
        ground2.setLocation(1140,415);
        ground2.setLocation(1139,489);
        teleporter2.setLocation(965,501);
        ground7.setLocation(83,456);
        teleporter3.setLocation(48,409);
        teleporter3.setLocation(45,420);
        ground7.setLocation(25,479);
        teleporter3.setLocation(31,440);
    }
}
