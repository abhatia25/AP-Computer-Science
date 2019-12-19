import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level05 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level05 extends World
{
    private Counter ourScore;
    public Counter getCounter()
    {
        return ourScore;
    }
    /**
     * Constructor for objects of class Level05.
     * 
     */
    public Level05()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    public Level05(Player player)
    {
        super(1200, 800, 1); 
        player.vspeed = 0;
        prepare();


        addObject(player,97,25);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ourScore = new Counter();
        addObject(ourScore,66,17);
        Ground ground = new Ground();
        addObject(ground,73,787);
        Ground ground2 = new Ground();
        addObject(ground2,250,735);
        Ground ground3 = new Ground();
        addObject(ground3,433,682);
        Ground ground4 = new Ground();
        addObject(ground4,611,642);
        ground.setLocation(61,788);
        Finish finish = new Finish();
        addObject(finish,783,769);
        Wall wall = new Wall();
        addObject(wall,914,724);
        Wall wall2 = new Wall();
        addObject(wall2,914,576);
        Wall wall3 = new Wall();
        addObject(wall3,914,437);
        Ground ground5 = new Ground();
        addObject(ground5,861,348);
        Ground ground6 = new Ground();
        addObject(ground6,717,348);
        Ground ground7 = new Ground();
        addObject(ground7,570,348);
        Ground ground8 = new Ground();
        addObject(ground8,421,348);
        Ground ground9 = new Ground();
        addObject(ground9,272,348);
        Ground ground10 = new Ground();
        addObject(ground10,122,348);
        Ground ground11 = new Ground();
        addObject(ground11,73,348);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2,780,311);
        Enemy enemy = new Enemy();
        addObject(enemy,117,311);
        Teleporter2 teleporter = new Teleporter2();
        addObject(teleporter,1126,781);
        Ground ground12 = new Ground();
        addObject(ground12,1015,397);
        Ground ground13 = new Ground();
        addObject(ground13,1125,518);
        Ground ground14 = new Ground();
        addObject(ground14,1015,649);
        Ground ground15 = new Ground();
        addObject(ground15,74,120);
        Ground ground16 = new Ground();
        addObject(ground16,223,146);
        Ground ground17 = new Ground();
        addObject(ground17,372,173);
        Ground ground18 = new Ground();
        addObject(ground18,520,173);
        Ground ground19 = new Ground();
        addObject(ground19,668,146);
        Ground ground20 = new Ground();
        addObject(ground20,816,120);
        Teleporter teleporter2 = new Teleporter();
        addObject(teleporter2,965,115);
        Wall wall4 = new Wall();
        addObject(wall4,1068,58);
        WallH wallH = new WallH();
        addObject(wallH,222,172);
        WallH wallH2 = new WallH();
        addObject(wallH2,73,143);
        WallH wallH3 = new WallH();
        addObject(wallH3,669,173);
        WallH wallH4 = new WallH();
        addObject(wallH4,817,146);
        WallH wallH5 = new WallH();
        addObject(wallH5,964,146);
        WallH wallH6 = new WallH();
        addObject(wallH6,1021,146);
        WallH wallH7 = new WallH();
        addObject(wallH7,371,199);
        WallH wallH8 = new WallH();
        addObject(wallH8,518,199);
    }
}
