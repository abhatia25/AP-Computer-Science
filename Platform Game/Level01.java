import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level01 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level01 extends World
{
    private Counter ourScore;
    public Counter getCounter()
    {
        return ourScore;
    }
    /**
     * Constructor for objects of class Level01.
     * 
     */
    public Level01()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
        Player player = new Player();
        addObject(player,97,61);
    }
    public Level01(Player player)
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

        Ground ground = new Ground();
        addObject(ground,105,186);
        Ground ground2 = new Ground();
        addObject(ground2,252,250);
        
        Ground ground3 = new Ground();
        addObject(ground3,556,746);
        Ground ground4 = new Ground();
        addObject(ground4,655,664);
        Ground ground5 = new Ground();
        addObject(ground5,737,570);
        Ground ground6 = new Ground();
        addObject(ground6,825,409);
        ground6.setLocation(844,443);
        ground6.setLocation(834,462);
        ground6.setLocation(847,496);
        Ground ground7 = new Ground();
        addObject(ground7,734,447);
        Ground ground8 = new Ground();
        addObject(ground8,817,381);
        Ground ground9 = new Ground();
        addObject(ground9,730,318);
        Ground ground10 = new Ground();
        addObject(ground10,733,253);
        Ground ground11 = new Ground();
        addObject(ground11,842,190);
        Ground ground12 = new Ground();
        addObject(ground12,919,131);
        Wall wall = new Wall();
        addObject(wall,1012,200);
        Wall wall2 = new Wall();
        addObject(wall2,1012,364);
        Wall wall3 = new Wall();
        addObject(wall3,1012,350);
        Wall wall4 = new Wall();
        addObject(wall4,1012,500);
        Wall wall5 = new Wall();
        addObject(wall5,1012,650);
        Finish finish = new Finish();
        addObject(finish,1120,788);
        Wall wall6 = new Wall();
        addObject(wall6,1012,800);

        ourScore = new Counter();
        addObject(ourScore,66,17);;
    }
}
