
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level08 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level08 extends World
{
    private Counter ourScore;
    public Counter getCounter()
    {
        return ourScore;
    }
    /**
     * Constructor for objects of class Level08.
     * 
     */
    public Level08()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    public Level08(Player player)
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
        addObject(ourScore,66,17);;
        Ground ground = new Ground();
        addObject(ground,74,172);
        Ground ground2 = new Ground();
        addObject(ground2,355,173);
        Ground ground3 = new Ground();
        addObject(ground3,639,176);
        Ground ground4 = new Ground();
        addObject(ground4,941,174);
        Ground ground5 = new Ground();
        addObject(ground5,1189,175);
        ground4.setLocation(955,168);
        Ground ground6 = new Ground();
        addObject(ground6,917,178);
        DeathTeleporter deathTeleporter = new DeathTeleporter();
        addObject(deathTeleporter,213,172);
        DeathTeleporter deathTeleporter2 = new DeathTeleporter();
        addObject(deathTeleporter2,499,173);
        DeathTeleporter deathTeleporter3 = new DeathTeleporter();
        addObject(deathTeleporter3,1051,176);
        Teleporter4 teleporter4 = new Teleporter4();
        addObject(teleporter4,770,176);
        ground4.setLocation(941,167);
        removeObject(ground4);

        Ground ground7 = new Ground();
        addObject(ground7,212,92);
        Ground ground8 = new Ground();
        addObject(ground8,490,94);
        Ground ground9 = new Ground();
        addObject(ground9,765,93);
        Ground ground10 = new Ground();
        addObject(ground10,1051,94);
        Wall wall = new Wall();
        addObject(wall,150,729);
        WallH wallH = new WallH();
        addObject(wallH,69,667);
        Ground ground11 = new Ground();
        addObject(ground11,210,399);
        Ground ground12 = new Ground();
        addObject(ground12,437,512);
        Ground ground13 = new Ground();
        addObject(ground13,681,636);
        Ground ground14 = new Ground();
        addObject(ground14,899,733);
        Teleporter4 teleporter42 = new Teleporter4();
        addObject(teleporter42,1048,738);
        removeObject(teleporter42);
        Teleporter4 teleporter410 = new Teleporter4();
        addObject(teleporter410,255,432);
        teleporter42.setLocation(973,765);
        DeathTeleporter deathTeleporter4 = new DeathTeleporter();
        addObject(deathTeleporter4,255,433);
        DeathTeleporter deathTeleporter5 = new DeathTeleporter();
        addObject(deathTeleporter5,495,546);
        DeathTeleporter deathTeleporter6 = new DeathTeleporter();
        addObject(deathTeleporter6,738,666);
        Wall wall2 = new Wall();
        addObject(wall2,1,756);
        wall2.setLocation(23,720);
        removeObject(wall2);
        Wall wall50 = new Wall();
        addObject(wall50,6,746);
        deathTeleporter6.setLocation(765,671);
        removeObject(teleporter410);
        Teleporter4 teleporter44 = new Teleporter4();
        addObject(teleporter44,946,766);
        Wall wall4 = new Wall();
        addObject(wall4,1033,461);
        WallH wallH2 = new WallH();
        addObject(wallH2,1129,399);

        wall4.setLocation(1033,525);
        Wall wall6 = new Wall();
        addObject(wall6,1033,525);
        WallH wallH3 = new WallH();
        addObject(wallH3,1131,588);

        Finish finish = new Finish();
        addObject(finish,1153,544);
        Wall wall7 = new Wall();
        addObject(wall7,1032,462);

        deathTeleporter6.setLocation(809,678);
        removeObject(teleporter44);
        Teleporter5 teleporter5 = new Teleporter5();
        addObject(teleporter5,939,766);
        deathTeleporter6.setLocation(740,662);
    }
}
