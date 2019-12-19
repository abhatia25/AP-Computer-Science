import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level06 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level06 extends World
{
    private Counter ourScore;
    public Counter getCounter()
    {
        return ourScore;
    }
    /**
     * Constructor for objects of class Level06.
     * 
     */
    public Level06()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    public Level06(Player player)
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
        addObject(ground,71,183);
        Wall wall = new Wall();
        addObject(wall,207,56);
        Ground ground2 = new Ground();
        addObject(ground2,218,184);
        Wall wall2 = new Wall();
        addObject(wall2,260,57);
        WallH wallH = new WallH();
        addObject(wallH,355,119);
        Ground ground3 = new Ground();
        addObject(ground3,349,182);
        Ground ground4 = new Ground();
        addObject(ground4,501,181);
        Ground ground5 = new Ground();
        addObject(ground5,590,116);
        Ground ground6 = new Ground();
        addObject(ground6,357,91);
        removeObject(ground6);
        Teleporter2 teleporter2 = new Teleporter2();
        addObject(teleporter2,362,89);
        Wall wall3 = new Wall();
        addObject(wall3,692,70);
        WallH wallH2 = new WallH();
        addObject(wallH2,649,182);
        Wall wall4 = new Wall();
        addObject(wall4,693,118);
        Ground ground7 = new Ground();
        addObject(ground7,74,370);
        Ground ground8 = new Ground();
        addObject(ground8,222,370);
        Ground ground9 = new Ground();
        addObject(ground9,369,370);
        Ground ground10 = new Ground();
        addObject(ground10,501,370);
        Ground ground11 = new Ground();
        addObject(ground11,629,370);
        Enemy3 enemy3 = new Enemy3();
        addObject(enemy3,180,327);
        enemy3.setLocation(182,332);
        Enemy4 enemy4 = new Enemy4();
        addObject(enemy4,683,334);
        Teleporter2 teleporter22 = new Teleporter2();
        addObject(teleporter22,779,374);
        Ground ground12 = new Ground();
        addObject(ground12,56,790);
        Ground ground13 = new Ground();
        addObject(ground13,54,718);
        Ground ground14 = new Ground();
        addObject(ground14,56,635);
        Ground ground15 = new Ground();
        addObject(ground15,56,572);
        Ground ground16 = new Ground();
        addObject(ground16,57,502);
        Ground ground17 = new Ground();
        addObject(ground17,206,502);
        Ground ground18 = new Ground();
        addObject(ground18,352,502);
        Ground ground19 = new Ground();
        addObject(ground19,570,795);
        Ground ground20 = new Ground();
        addObject(ground20,719,794);
        Ground ground21 = new Ground();
        addObject(ground21,868,794);
        Ground ground22 = new Ground();
        addObject(ground22,1016,794);

        Enemy3 enemy32 = new Enemy3();
        addObject(enemy32,884,108);
        enemy32.setLocation(741,111);
        Enemy4 enemy42 = new Enemy4();
        addObject(enemy42,1179,114);
        Finish finish = new Finish();
        addObject(finish,1000,186);
        Ground ground23 = new Ground();
        addObject(ground23,1190,70);
        Teleporter2 teleporter23 = new Teleporter2();
        addObject(teleporter23,1166,797);

        WallH wallH3 = new WallH();
        addObject(wallH3,799,182);
        WallH wallH4 = new WallH();
        addObject(wallH4,831,206);
        Wall wall5 = new Wall();
        addObject(wall5,878,287);
        Wall wall6 = new Wall();
        addObject(wall6,883,317);
        WallH wallH5 = new WallH();
        addObject(wallH5,980,229);
        WallH wallH6 = new WallH();
        addObject(wallH6,1130,230);
        WallH wallH7 = new WallH();
        addObject(wallH7,1169,205);
        WallH wallH8 = new WallH();
        addObject(wallH8,1168,178);
        wallH8.setLocation(1168,168);
        WallH wallH9 = new WallH();
        addObject(wallH9,1168,168);
        wallH3.setLocation(831,185);
        WallH wallH10 = new WallH();
        addObject(wallH10,831,185);
        wallH3.setLocation(832,169);
        WallH wallH11 = new WallH();
        addObject(wallH11,832,169);
        wallH3.setLocation(742,169);
        WallH wallH12 = new WallH();
        addObject(wallH12,742,169);
        removeObject(wallH);
        removeObject(wall2);
        removeObject(wall);
        Wall wall7 = new Wall();
        addObject(wall7,259,32);
        WallH wallH13 = new WallH();
        addObject(wallH13,307,132);
        WallH wallH14 = new WallH();
        addObject(wallH14,362,130);
        WallH wallH15 = new WallH();
        addObject(wallH15,306,123);
        WallH wallH16 = new WallH();
        addObject(wallH16,361,123);
        WallH wallH17 = new WallH();
        addObject(wallH17,1168,184);
        WallH wallH18 = new WallH();
        addObject(wallH18,302,147);
        WallH wallH19 = new WallH();
        addObject(wallH19,362,148);
        removeObject(wallH19);
        removeObject(wallH18);
        wallH13.setLocation(306,140);
        WallH wallH20 = new WallH();
        addObject(wallH20,306,140);
        wallH13.setLocation(362,140);
        WallH wallH21 = new WallH();
        addObject(wallH21,362,140);
        removeObject(ground16);
        ground17.setLocation(174,573);
        ground18.setLocation(319,575);
        removeObject(wallH21);
        wallH13.setLocation(391,127);
        removeObject(wallH16);
        removeObject(wallH20);
        removeObject(wallH15);
        wallH14.setLocation(374,124);
        wallH13.setLocation(384,136);
        removeObject(wallH14);
        removeObject(wallH13);
    }
}
