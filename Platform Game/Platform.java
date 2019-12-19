import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platfrom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    public int platformMove = 0;
    /**
     * Act - do whatever the Platfrom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(platformMove < 320 && platformMove >= 0)
        {
            setLocation(getX(), getY() - 2);
            
            platformMove = platformMove + 1;
        }
        if(platformMove >= -320 && platformMove < 0)
        {
            setLocation(getX(), getY() + 2);
            
            platformMove = platformMove + 1;
        }
        if(platformMove == 320)
        {
            platformMove = -320;
        }
    }    
}
