import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level09 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level09 extends World
{
    private Counter ourScore;
    public Counter getCounter()
    {
        return ourScore;
    }
    /**
     * Constructor for objects of class Level09.
     * 
     */
    public Level09()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }

    public Level09(Player player)
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
        addObject(ground,73,182);
        DeathTeleporter deathTeleporter = new DeathTeleporter();
        addObject(deathTeleporter,223,188);
        Wall wall = new Wall();
        addObject(wall,326,132);
        wall.setLocation(326,74);
        Wall wall2 = new Wall();
        addObject(wall2,326,74);
        Ground ground2 = new Ground();
        addObject(ground2,73,790);
        Ground ground3 = new Ground();
        addObject(ground3,218,790);
        Ground ground4 = new Ground();
        addObject(ground4,365,790);
        Ground ground5 = new Ground();
        addObject(ground5,511,790);
        Ground ground6 = new Ground();
        addObject(ground6,653,790);
        Ground ground7 = new Ground();
        addObject(ground7,793,790);
        Ground ground8 = new Ground();
        addObject(ground8,941,790);
        Ground ground9 = new Ground();
        addObject(ground9,1089,790);
        Ground ground10 = new Ground();
        addObject(ground10,1163,790);
        Wall wall3 = new Wall();
        addObject(wall3,325,132);

        Enemy5 enemy5 = new Enemy5();
        addObject(enemy5,300,750);
        Enemy5 enemy52 = new Enemy5();
        addObject(enemy52,300,700);
        Enemy5 enemy53 = new Enemy5();
        addObject(enemy53,300,600);
        Enemy5 enemy54 = new Enemy5();
        addObject(enemy54,300,550);
        Enemy5 enemy55 = new Enemy5();
        addObject(enemy55,300,500);

        Enemy5 enemy511 = new Enemy5();
        addObject(enemy511,900,750);
        Enemy5 enemy512 = new Enemy5();
        addObject(enemy512,900,700);
        Enemy5 enemy513 = new Enemy5();
        addObject(enemy513,900,600);
        Enemy5 enemy514 = new Enemy5();
        addObject(enemy514,900,550);
        Enemy5 enemy515 = new Enemy5();
        addObject(enemy515,900,500);

        Enemy6 enemy6 = new Enemy6();
        addObject(enemy6,300,750);
        Enemy6 enemy62 = new Enemy6();
        addObject(enemy62,300,700);
        Enemy6 enemy63 = new Enemy6();
        addObject(enemy63,300,600);
        Enemy6 enemy64 = new Enemy6();
        addObject(enemy64,300,550);
        Enemy6 enemy65 = new Enemy6();
        addObject(enemy65,300,500);

        Enemy6 enemy611 = new Enemy6();
        addObject(enemy611,900,750);
        Enemy6 enemy612 = new Enemy6();
        addObject(enemy612,900,700);
        Enemy6 enemy613 = new Enemy6();
        addObject(enemy613,900,600);
        Enemy6 enemy614 = new Enemy6();
        addObject(enemy614,900,550);
        Enemy6 enemy615 = new Enemy6();
        addObject(enemy615,900,500);

        
        Ground ground11 = new Ground();
        addObject(ground11,1127,711);
        Ground ground12 = new Ground();
        addObject(ground12,1126,637);
        Ground ground13 = new Ground();
        addObject(ground13,1127,547);
        Ground ground14 = new Ground();
        addObject(ground14,1126,463);
        Ground ground15 = new Ground();
        addObject(ground15,916,350);
        Ground ground16 = new Ground();
        addObject(ground16,1126,239);
        Finish finish = new Finish();
        addObject(finish,896,145);
    }
}
