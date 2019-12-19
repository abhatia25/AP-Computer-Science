import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public int enemyWalk = 0;
    public int enemyMove = 0;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(enemyWalk < 320 && enemyWalk >= 0)
        {
            setLocation(getX() + 2, getY());
            enemyWalk = enemyWalk + 1;
            enemyMove = enemyMove + 1;
        }
        if(enemyWalk >= -320 && enemyWalk < 0)
        {
            setLocation(getX() - 2, getY());
            enemyWalk = enemyWalk + 1;
            enemyMove = enemyMove + 1;
        }
        if (enemyMove > 0)
        {
            setImage("enemy1.png");
        }
        if (enemyMove > 20)
        {
            setImage("enemy2.png");
        }
        if (enemyMove > 40)
        {
            enemyMove = 0;
        }
        if(enemyWalk == 320)
        {
            enemyWalk = -320;
        }
    }    
}
