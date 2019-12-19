import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Actor
{
    public int enemyWalk2 = 0;
    public int enemyMove2 = 0;
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(enemyWalk2 < 320 && enemyWalk2 >= 0)
        {
            setLocation(getX() - 2, getY());
            enemyWalk2 = enemyWalk2 + 1;
            enemyMove2 = enemyMove2 + 1;
        }
        if(enemyWalk2 >= -320 && enemyWalk2 < 0)
        {
            setLocation(getX() + 2, getY());
            enemyWalk2 = enemyWalk2 + 1;
            enemyMove2 = enemyMove2 + 1;
        }
        if (enemyMove2 > 0)
        {
            setImage("enemy1.png");
        }
        if (enemyMove2 > 20)
        {
            setImage("enemy2.png");
        }
        if (enemyMove2 > 40)
        {
            enemyMove2 = 0;
        }
        if(enemyWalk2 == 320)
        {
            enemyWalk2 = -320;
        }
    }    
}
