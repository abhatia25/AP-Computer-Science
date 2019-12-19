import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level07 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level07 extends World
{

    private Counter ourScore;
    public Counter getCounter()
    {
        return ourScore;
    }
    /**
     * Constructor for objects of class Level07.
     * 
     */
    public Level07()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    public Level07(Player player)
    {
        super(1200, 800, 1); 
        player.vspeed = 0;
        prepare();


        addObject(player,74,750);
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
        addObject(ground,74,789);
        Ground ground2 = new Ground();
        addObject(ground2,222,789);
        Ground ground3 = new Ground();
        addObject(ground3,371,789);
        Ground ground4 = new Ground();
        addObject(ground4,519,789);
        Ground ground5 = new Ground();
        addObject(ground5,668,789);
        Ground ground6 = new Ground();
        addObject(ground6,818,789);
        Ground ground7 = new Ground();
        addObject(ground7,965,789);
        Ground ground8 = new Ground();
        addObject(ground8,1113,789);
        ground8.setLocation(1187,789);
        Ground ground9 = new Ground();
        addObject(ground9,1187,789);
        Ground ground10 = new Ground();
        addObject(ground10,1085,790);

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

        Enemy5 enemy56 = new Enemy5();
        addObject(enemy56,600,750);
        Enemy5 enemy57 = new Enemy5();
        addObject(enemy57,600,700);
        Enemy5 enemy58 = new Enemy5();
        addObject(enemy58,600,600);
        Enemy5 enemy59 = new Enemy5();
        addObject(enemy59,600,550);
        Enemy5 enemy510 = new Enemy5();
        addObject(enemy510,600,500);

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

        Enemy5 enemy517 = new Enemy5();
        addObject(enemy517,1200,700);
        Enemy5 enemy518 = new Enemy5();
        addObject(enemy518,1200,600);
        Enemy5 enemy519 = new Enemy5();
        addObject(enemy519,1200,550);
        Enemy5 enemy520 = new Enemy5();
        addObject(enemy520,1200,500);
        Enemy5 enemy521 = new Enemy5();
        addObject(enemy521,1200,750);

        Ground ground11 = new Ground();
        addObject(ground11,1127,710);
        Ground ground12 = new Ground();
        addObject(ground12,1126,610);
        Ground ground13 = new Ground();
        addObject(ground13,1129,504);
        Ground ground14 = new Ground();
        addObject(ground14,1127,435);
        Ground ground15 = new Ground();
        addObject(ground15,984,435);
        Ground ground16 = new Ground();
        addObject(ground16,834,435);
        Ground ground17 = new Ground();
        addObject(ground17,687,435);
        ground17.setLocation(698,435);
        Ground ground18 = new Ground();
        addObject(ground18,540,435);
        Ground ground19 = new Ground();
        addObject(ground19,390,435);
        Ground ground20 = new Ground();
        addObject(ground20,242,435);
        Ground ground21 = new Ground();
        addObject(ground21,96,435);
        ground21.setLocation(64,435);
        Ground ground22 = new Ground();
        addObject(ground22,64,435);
        ground17.setLocation(683,434);
        ground20.setLocation(198,430);
        Ground ground23 = new Ground();
        addObject(ground23,154,434);
        ground16.setLocation(768,434);
        Ground ground24 = new Ground();
        addObject(ground24,768,434);
        Teleporter2 teleporter2 = new Teleporter2();
        addObject(teleporter2,72,131);
        Teleporter2 teleporter22 = new Teleporter2();
        addObject(teleporter22,206,131);
        Teleporter2 teleporter23 = new Teleporter2();
        addObject(teleporter23,70,263);
        Teleporter2 teleporter24 = new Teleporter2();
        addObject(teleporter24,196,263);
        Teleporter2 teleporter25 = new Teleporter2();
        addObject(teleporter25,73,402);
        Teleporter2 teleporter26 = new Teleporter2();
        addObject(teleporter26,193,403);
        Wall wall = new Wall();
        addObject(wall,307,74);
        Wall wall2 = new Wall();
        addObject(wall2,308,224);
        Wall wall3 = new Wall();
        addObject(wall3,308,374);
        removeObject(ground20);
        removeObject(ground23);
        removeObject(ground22);
        removeObject(ground21);
        teleporter26.setLocation(206,404);
        Teleporter2 teleporter27 = new Teleporter2();
        addObject(teleporter27,206,404);
        teleporter24.setLocation(207,263);
        Teleporter2 teleporter28 = new Teleporter2();
        addObject(teleporter28,207,263);
        Ground ground201 = new Ground();
        addObject(ground201,851,435);
        Enemy enemy = new Enemy();
        addObject(enemy,364,398);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2,1178,395);
        Ground ground26 = new Ground();
        addObject(ground26,769,354);
        Ground ground27 = new Ground();
        addObject(ground27,767,277);
        Ground ground28 = new Ground();
        addObject(ground28,411,219);
        Ground ground29 = new Ground();
        addObject(ground29,559,218);
        Ground ground30 = new Ground();
        addObject(ground30,680,218);
        Ground ground31 = new Ground();
        addObject(ground31,825,218);
        Ground ground32 = new Ground();
        addObject(ground32,971,218);
        Ground ground33 = new Ground();
        addObject(ground33,1118,218);
        Ground ground34 = new Ground();
        addObject(ground34,1145,218);
        Ground ground35 = new Ground();
        addObject(ground35,731,111);
        Finish finish = new Finish();
        addObject(finish,505,50);
        removeObject(wall);
        removeObject(teleporter22);
        removeObject(teleporter2);
        removeObject(teleporter28);
        removeObject(teleporter23);
        removeObject(teleporter24);
        removeObject(teleporter27);
        removeObject(teleporter26);
        removeObject(teleporter25);
        removeObject(finish);
        Ground ground36 = new Ground();
        addObject(ground36,551,81);
        Ground ground37 = new Ground();
        addObject(ground37,402,82);
        Ground ground38 = new Ground();
        addObject(ground38,251,80);
        Finish finish2 = new Finish();
        addObject(finish2,188,419);
        Finish finish3 = new Finish();
        addObject(finish3,58,419);
        removeObject(ground38);
        Teleporter3 teleporter3 = new Teleporter3();
        addObject(teleporter3,74,106);
        teleporter3.setLocation(131,105);
        Teleporter3 teleporter32 = new Teleporter3();
        addObject(teleporter32,131,105);
        Teleporter3 teleporter33 = new Teleporter3();
        addObject(teleporter33,64,106);
        Wall wall4 = new Wall();
        addObject(wall4,209,73);
        wall4.setLocation(216,57);
        Ground ground39 = new Ground();
        addObject(ground39,50,76);
    }
}
