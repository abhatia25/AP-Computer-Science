import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy5 extends Actor
{
    /**
     * Act - do whatever the Enemy5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() - 4, getY());
        if(getX() < 10)
        {
            int yValue = getY();
            
            
            setLocation(1200, yValue);
        }
    }    
}
