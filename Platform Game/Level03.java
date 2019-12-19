import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level03 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level03 extends World
{
    private Counter ourScore;
    public Counter getCounter()
    {
        return ourScore;
    }
    /**
     * Constructor for objects of class Level03.
     * 
     */
    public Level03()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }

    public Level03(Player player)
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
        addObject(ground,74,231);
        Ground ground2 = new Ground();
        addObject(ground2,222,230);
        Ground ground3 = new Ground();
        addObject(ground3,372,230);
        Ground ground4 = new Ground();
        addObject(ground4,522,230);
        Ground ground5 = new Ground();
        addObject(ground5,672,230);
        Teleporter teleporter = new Teleporter();
        addObject(teleporter,818,235);
        Wall wall = new Wall();
        addObject(wall,919,178);
        Wall wall2 = new Wall();
        addObject(wall2,919,74);
        ground3.setLocation(432,229);
        Wall wall3 = new Wall();
        addObject(wall3,432,229);
        Ground ground6 = new Ground();
        addObject(ground6,385,138);
        Ground ground7 = new Ground();
        addObject(ground7,478,137);
        ground7.setLocation(474,146);
        ground7.setLocation(487,138);
        Ground ground8 = new Ground();
        addObject(ground8,1129,495);
        Ground ground9 = new Ground();
        addObject(ground9,995,495);
        Ground ground10 = new Ground();
        addObject(ground10,353,231);
        Wall wall4 = new Wall();
        addObject(wall4,920,330);
        Ground ground11 = new Ground();
        addObject(ground11,862,495);
        Ground ground12 = new Ground();
        addObject(ground12,713,496);
        Ground ground13 = new Ground();
        addObject(ground13,772,339);
        removeObject(ground13);
        Wall wall5 = new Wall();
        addObject(wall5,865,331);
        Wall wall6 = new Wall();
        addObject(wall6,812,332);
        Wall wall7 = new Wall();
        addObject(wall7,756,331);
        Teleporter teleporter2 = new Teleporter();
        addObject(teleporter2,416,506);
        teleporter2.setLocation(592,511);
        Wall wall8 = new Wall();
        addObject(wall8,462,445);
        Wall wall9 = new Wall();
        addObject(wall9,460,346);
        Ground ground20 = new Ground();
        addObject(ground20,92,772);
        Ground ground14 = new Ground();
        addObject(ground14,271,705);
        Ground ground15 = new Ground();
        addObject(ground15,429,653);
        Ground ground16 = new Ground();
        addObject(ground16,579,652);
        Ground ground17 = new Ground();
        addObject(ground17,719,650);
        Ground ground18 = new Ground();
        addObject(ground18,888,738);
        Ground ground19 = new Ground();
        addObject(ground19,1028,738);
        Teleporter teleporter3 = new Teleporter();
        addObject(teleporter3,1128,742);
        teleporter3.setLocation(1134,727);
        teleporter3.setLocation(1141,720);
        removeObject(teleporter3);
        Finish finish = new Finish();
        addObject(finish,1105,754);
        finish.setLocation(1142,732);
        teleporter2.setLocation(593,492);
        wall8.setLocation(497,467);
        wall8.setLocation(493,407);
    }
}
