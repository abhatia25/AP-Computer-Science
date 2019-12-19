import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3 extends Actor
{
    public int enemyWalk3 = 0;
    public int enemyMove3 = 0;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(enemyWalk3 < 125 && enemyWalk3 >= 0)
        {
            setLocation(getX() + 2, getY());
            enemyWalk3 = enemyWalk3 + 1;
            enemyMove3 = enemyMove3 + 1;
        }
        if(enemyWalk3 >= -125 && enemyWalk3 < 0)
        {
            setLocation(getX() - 2, getY());
            enemyWalk3 = enemyWalk3 + 1;
            enemyMove3 = enemyMove3 + 1;
        }
        if (enemyMove3 > 0)
        {
            setImage("enemy1.png");
        }
        if (enemyMove3 > 20)
        {
            setImage("enemy2.png");
        }
        if (enemyMove3 > 40)
        {
            enemyMove3 = 0;
        }
        if(enemyWalk3 == 125)
        {
            enemyWalk3 = -125;
        }
    }    
}
